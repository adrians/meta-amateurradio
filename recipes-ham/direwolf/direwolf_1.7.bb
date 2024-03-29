SUMMARY = "Direwolf APRS decoder"

DESCRIPTION = "Dire Wolf is a software 'soundcard' AX.25 packet modem/TNC and \
APRS encoder/decoder. It can be used stand-alone to observe APRS traffic, as a \
tracker, digipeater, APRStt gateway, or Internet Gateway (IGate)."

HOMEPAGE = "https://github.com/wb2osz/direwolf/"

LICENSE = "GPL-2.0-only"
LIC_FILES_CHKSUM = "file://LICENSE;md5=fa22e16ebbe6638b2bd253338fbded9f"

SRC_URI = "git://github.com/wb2osz/direwolf.git;protocol=https;branch=master \
          "

SRCREV = "de293a1f2526ec6639fe31fa411bd4f2319ecdf4"

S = "${WORKDIR}/git"

DEPENDS = "alsa-lib udev"
RDEPENDS:${PN} = "bash perl"

inherit cmake

do_install:append() {
	rm -f ${D}/usr/bin/telem-volts.py
}

EXTRA_OECMAKE:append:arm = " ${@bb.utils.contains("TUNE_FEATURES","neon","-DRUN_NEON=0","-DRUN_NEON=1",d)}"
