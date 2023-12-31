SUMMARY = "Simple abstraction layer for PiRacer and PiRacer Pro"
AUTHOR = "Torsten Wylegala <mail@twyleg.de>"
LICENSE = "GPL-3.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=6decff0ca0b506b9b7a5f54ac3d286f8"
INSANE_SKIP:${PN} = "already-stripped"

SRC_URI = "git://github.com/twyleg/piracer_py.git;protocol=https \
file://ssd1306_ignore.patch \
file://Motor_direction_modified.patch \
file://extra_button.patch \
"
SRCREV = "7314ec1874388dc4ebc863aa429f82222b534ac1" 
S = "${WORKDIR}/git"

do_install() {
    install -d ${D}${libdir}/python3.10/site-packages/
    cp -R ${WORKDIR}/git/piracer ${D}${libdir}/python3.10/site-packages/
}

FILES:${PN} = "${libdir}/python3.10/site-packages/*"
