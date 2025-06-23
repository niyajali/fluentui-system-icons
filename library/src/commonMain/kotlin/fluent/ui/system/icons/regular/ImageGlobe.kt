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

public val FluentIcons.Regular.ImageGlobe: ImageVector
    get() {
        if (_ImageGlobe != null) {
            return _ImageGlobe!!
        }
        _ImageGlobe = ImageVector.Builder(
            name = "Regular.ImageGlobe",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(5.007f, 6f)
                curveTo(5.047f, 4.585f, 5.255f, 3.331f, 5.56f, 2.415f)
                curveTo(5.731f, 1.902f, 5.924f, 1.522f, 6.114f, 1.281f)
                curveTo(6.309f, 1.034f, 6.443f, 1f, 6.5f, 1f)
                curveTo(6.557f, 1f, 6.691f, 1.034f, 6.886f, 1.281f)
                curveTo(7.076f, 1.522f, 7.269f, 1.902f, 7.44f, 2.415f)
                curveTo(7.745f, 3.331f, 7.953f, 4.585f, 7.993f, 6f)
                horizontalLineTo(5.007f)
                close()
            }
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(4.611f, 2.099f)
                curveTo(4.719f, 1.777f, 4.841f, 1.478f, 4.979f, 1.213f)
                curveTo(2.836f, 1.828f, 1.229f, 3.712f, 1.022f, 6f)
                horizontalLineTo(4.007f)
                curveTo(4.047f, 4.5f, 4.266f, 3.135f, 4.611f, 2.099f)
                close()
            }
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(8.389f, 2.099f)
                curveTo(8.281f, 1.777f, 8.159f, 1.478f, 8.021f, 1.213f)
                curveTo(10.164f, 1.828f, 11.771f, 3.712f, 11.978f, 6f)
                horizontalLineTo(8.993f)
                curveTo(8.953f, 4.5f, 8.734f, 3.135f, 8.389f, 2.099f)
                close()
            }
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(8.993f, 7f)
                horizontalLineTo(11.978f)
                curveTo(11.771f, 9.288f, 10.164f, 11.172f, 8.021f, 11.787f)
                curveTo(8.159f, 11.522f, 8.281f, 11.223f, 8.389f, 10.901f)
                curveTo(8.734f, 9.865f, 8.953f, 8.5f, 8.993f, 7f)
                close()
            }
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(6.886f, 11.719f)
                curveTo(6.691f, 11.966f, 6.557f, 12f, 6.5f, 12f)
                curveTo(6.443f, 12f, 6.309f, 11.966f, 6.114f, 11.719f)
                curveTo(5.924f, 11.478f, 5.731f, 11.098f, 5.56f, 10.585f)
                curveTo(5.255f, 9.669f, 5.047f, 8.415f, 5.007f, 7f)
                horizontalLineTo(7.993f)
                curveTo(7.953f, 8.415f, 7.745f, 9.669f, 7.44f, 10.585f)
                curveTo(7.269f, 11.098f, 7.076f, 11.478f, 6.886f, 11.719f)
                close()
            }
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(1.022f, 7f)
                curveTo(1.229f, 9.288f, 2.836f, 11.172f, 4.979f, 11.787f)
                curveTo(4.841f, 11.522f, 4.719f, 11.223f, 4.611f, 10.901f)
                curveTo(4.266f, 9.865f, 4.047f, 8.5f, 4.007f, 7f)
                horizontalLineTo(1.022f)
                close()
            }
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(17.75f, 4.5f)
                horizontalLineTo(12.686f)
                curveTo(12.514f, 3.967f, 12.275f, 3.463f, 11.978f, 3f)
                horizontalLineTo(17.75f)
                curveTo(19.545f, 3f, 21f, 4.455f, 21f, 6.25f)
                verticalLineTo(17.75f)
                curveTo(21f, 19.545f, 19.545f, 21f, 17.75f, 21f)
                horizontalLineTo(6.25f)
                curveTo(4.455f, 21f, 3f, 19.545f, 3f, 17.75f)
                verticalLineTo(11.978f)
                curveTo(3.463f, 12.275f, 3.967f, 12.514f, 4.5f, 12.686f)
                verticalLineTo(17.75f)
                curveTo(4.5f, 17.958f, 4.536f, 18.158f, 4.603f, 18.344f)
                lineTo(10.426f, 12.643f)
                curveTo(11.259f, 11.827f, 12.568f, 11.788f, 13.446f, 12.527f)
                lineTo(13.574f, 12.643f)
                lineTo(19.396f, 18.345f)
                curveTo(19.463f, 18.159f, 19.5f, 17.959f, 19.5f, 17.75f)
                verticalLineTo(6.25f)
                curveTo(19.5f, 5.284f, 18.716f, 4.5f, 17.75f, 4.5f)
                close()
                moveTo(18.33f, 19.401f)
                lineTo(12.525f, 13.715f)
                curveTo(12.26f, 13.455f, 11.85f, 13.432f, 11.559f, 13.644f)
                lineTo(11.475f, 13.715f)
                lineTo(5.668f, 19.401f)
                curveTo(5.85f, 19.465f, 6.046f, 19.5f, 6.25f, 19.5f)
                horizontalLineTo(17.75f)
                curveTo(17.954f, 19.5f, 18.149f, 19.465f, 18.33f, 19.401f)
                close()
            }
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(15.252f, 6.5f)
                curveTo(16.496f, 6.5f, 17.504f, 7.508f, 17.504f, 8.752f)
                curveTo(17.504f, 9.996f, 16.496f, 11.004f, 15.252f, 11.004f)
                curveTo(14.008f, 11.004f, 13f, 9.996f, 13f, 8.752f)
                curveTo(13f, 7.508f, 14.008f, 6.5f, 15.252f, 6.5f)
                close()
                moveTo(15.252f, 8f)
                curveTo(14.837f, 8f, 14.5f, 8.337f, 14.5f, 8.752f)
                curveTo(14.5f, 9.167f, 14.837f, 9.504f, 15.252f, 9.504f)
                curveTo(15.667f, 9.504f, 16.004f, 9.167f, 16.004f, 8.752f)
                curveTo(16.004f, 8.337f, 15.667f, 8f, 15.252f, 8f)
                close()
            }
        }.build()

        return _ImageGlobe!!
    }

@Suppress("ObjectPropertyName")
private var _ImageGlobe: ImageVector? = null

@Preview
@Composable
private fun ImageGlobePreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.ImageGlobe, contentDescription = null)
    }
}
