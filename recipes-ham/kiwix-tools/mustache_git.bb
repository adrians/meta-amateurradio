LICENSE = "BSL-1.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=9df08b19634b86f9db5ebbe1fd26ead3"

SRC_URI = "git://github.com/kainjow/Mustache.git;protocol=https;branch=master \
          "

SRCREV = "04277d5552c6e46bee41a946b7d175a660ea1b3d"

inherit cmake

S = "${WORKDIR}/git"

ALLOW_EMPTY:${PN} = "1"

do_install() {
    install -D -m 0755 ${S}/mustache.hpp ${D}${includedir}/mustache.hpp
}

