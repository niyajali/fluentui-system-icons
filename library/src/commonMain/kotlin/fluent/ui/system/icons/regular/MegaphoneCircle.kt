/*
 * MIT License
 *
 * Copyright (c) 2020 Microsoft Corporation
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */
package fluent.ui.system.icons.regular

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import org.jetbrains.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import fluent.ui.system.icons.FluentIcons

public val FluentIcons.Regular.MegaphoneCircle: ImageVector
    get() {
        if (_MegaphoneCircle != null) {
            return _MegaphoneCircle!!
        }
        _MegaphoneCircle = ImageVector.Builder(
            name = "Regular.MegaphoneCircle",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(3.5f, 12f)
                curveTo(3.5f, 7.306f, 7.306f, 3.5f, 12f, 3.5f)
                curveTo(16.694f, 3.5f, 20.5f, 7.306f, 20.5f, 12f)
                curveTo(20.5f, 16.694f, 16.694f, 20.5f, 12f, 20.5f)
                curveTo(7.306f, 20.5f, 3.5f, 16.694f, 3.5f, 12f)
                close()
                moveTo(12f, 2f)
                curveTo(6.477f, 2f, 2f, 6.477f, 2f, 12f)
                curveTo(2f, 17.523f, 6.477f, 22f, 12f, 22f)
                curveTo(17.523f, 22f, 22f, 17.523f, 22f, 12f)
                curveTo(22f, 6.477f, 17.523f, 2f, 12f, 2f)
                close()
                moveTo(14.64f, 7.107f)
                curveTo(15.783f, 6.684f, 16.997f, 7.53f, 16.997f, 8.748f)
                verticalLineTo(15.248f)
                curveTo(16.997f, 16.467f, 15.783f, 17.313f, 14.64f, 16.89f)
                lineTo(13.078f, 16.312f)
                curveTo(12.701f, 17.299f, 11.745f, 18f, 10.625f, 18f)
                curveTo(9.175f, 18f, 8f, 16.825f, 8f, 15.375f)
                verticalLineTo(14.434f)
                lineTo(7.139f, 14.115f)
                curveTo(6.452f, 13.861f, 5.996f, 13.206f, 5.996f, 12.474f)
                verticalLineTo(11.523f)
                curveTo(5.996f, 10.791f, 6.452f, 10.136f, 7.139f, 9.882f)
                lineTo(14.64f, 7.107f)
                close()
                moveTo(9.5f, 14.988f)
                verticalLineTo(15.375f)
                curveTo(9.5f, 15.996f, 10.004f, 16.5f, 10.625f, 16.5f)
                curveTo(11.099f, 16.5f, 11.505f, 16.206f, 11.67f, 15.791f)
                lineTo(9.5f, 14.988f)
                close()
                moveTo(15.497f, 8.748f)
                curveTo(15.497f, 8.574f, 15.324f, 8.454f, 15.161f, 8.514f)
                lineTo(7.659f, 11.289f)
                curveTo(7.561f, 11.325f, 7.496f, 11.419f, 7.496f, 11.523f)
                verticalLineTo(12.474f)
                curveTo(7.496f, 12.578f, 7.561f, 12.672f, 7.659f, 12.708f)
                lineTo(15.161f, 15.483f)
                curveTo(15.324f, 15.543f, 15.497f, 15.422f, 15.497f, 15.248f)
                verticalLineTo(8.748f)
                close()
            }
        }.build()

        return _MegaphoneCircle!!
    }

@Suppress("ObjectPropertyName")
private var _MegaphoneCircle: ImageVector? = null

@Preview
@Composable
private fun MegaphoneCirclePreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.MegaphoneCircle, contentDescription = null)
    }
}
