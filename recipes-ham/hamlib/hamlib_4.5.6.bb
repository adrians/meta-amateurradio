SUMMARY = "Hamlib"

DESCRIPTION = "The Ham Radio Control Library-Hamlib, for short-is a project to \
provide programs with a consistent Application Programming Interface (API) for \
controlling the myriad of radios and rotators available to amateur radio and \
communications users."

HOMEPAGE = "https://hamlib.github.io/"
LICENSE = "GPL-2.0-or-later"
LIC_FILES_CHKSUM = "file://COPYING;md5=b234ee4d69f5fce4486a80fdaf4a4263"

SRC_URI = "git://github.com/Hamlib/Hamlib/;protocol=https;branch=Hamlib-4.5.6 \
          "

SRCREV = "8832ad144a5f9e9990bc540c0b5cfc9f26e0f193"

DEPENDS = "libusb1 readline"

S = "${WORKDIR}/git"

inherit autotools

# WSJT-X requires the /usr/bin files from here to be available in the sysroot
SYSROOT_DIRS += "${bindir}"
