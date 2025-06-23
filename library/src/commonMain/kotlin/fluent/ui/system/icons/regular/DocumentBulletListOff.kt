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

public val FluentIcons.Regular.DocumentBulletListOff: ImageVector
    get() {
        if (_DocumentBulletListOff != null) {
            return _DocumentBulletListOff!!
        }
        _DocumentBulletListOff = ImageVector.Builder(
            name = "Regular.DocumentBulletListOff",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(7f, 12.25f)
                curveTo(7f, 11.836f, 7.336f, 11.5f, 7.75f, 11.5f)
                curveTo(8.164f, 11.5f, 8.5f, 11.836f, 8.5f, 12.25f)
                curveTo(8.5f, 12.664f, 8.164f, 13f, 7.75f, 13f)
                curveTo(7.336f, 13f, 7f, 12.664f, 7f, 12.25f)
                close()
                moveTo(7.75f, 14.5f)
                curveTo(7.336f, 14.5f, 7f, 14.836f, 7f, 15.25f)
                curveTo(7f, 15.664f, 7.336f, 16f, 7.75f, 16f)
                curveTo(8.164f, 16f, 8.5f, 15.664f, 8.5f, 15.25f)
                curveTo(8.5f, 14.836f, 8.164f, 14.5f, 7.75f, 14.5f)
                close()
                moveTo(7f, 18.25f)
                curveTo(7f, 17.836f, 7.336f, 17.5f, 7.75f, 17.5f)
                curveTo(8.164f, 17.5f, 8.5f, 17.836f, 8.5f, 18.25f)
                curveTo(8.5f, 18.664f, 8.164f, 19f, 7.75f, 19f)
                curveTo(7.336f, 19f, 7f, 18.664f, 7f, 18.25f)
                close()
                moveTo(4f, 5.061f)
                lineTo(2.22f, 3.28f)
                curveTo(1.927f, 2.987f, 1.927f, 2.513f, 2.22f, 2.22f)
                curveTo(2.513f, 1.927f, 2.987f, 1.927f, 3.28f, 2.22f)
                lineTo(21.78f, 20.72f)
                curveTo(22.073f, 21.013f, 22.073f, 21.488f, 21.78f, 21.781f)
                curveTo(21.487f, 22.073f, 21.012f, 22.073f, 20.719f, 21.781f)
                lineTo(19.804f, 20.865f)
                curveTo(19.481f, 21.536f, 18.794f, 22f, 18f, 22f)
                horizontalLineTo(6f)
                curveTo(4.896f, 22f, 4f, 21.104f, 4f, 20f)
                verticalLineTo(5.061f)
                close()
                moveTo(18.5f, 19.561f)
                lineTo(16.966f, 18.027f)
                curveTo(16.988f, 18.098f, 17f, 18.173f, 17f, 18.25f)
                curveTo(17f, 18.664f, 16.664f, 19f, 16.25f, 19f)
                horizontalLineTo(10.75f)
                curveTo(10.336f, 19f, 10f, 18.664f, 10f, 18.25f)
                curveTo(10f, 17.836f, 10.336f, 17.5f, 10.75f, 17.5f)
                horizontalLineTo(16.25f)
                curveTo(16.327f, 17.5f, 16.402f, 17.512f, 16.473f, 17.534f)
                lineTo(14.939f, 16f)
                horizontalLineTo(10.75f)
                curveTo(10.336f, 16f, 10f, 15.664f, 10f, 15.25f)
                curveTo(10f, 14.836f, 10.336f, 14.5f, 10.75f, 14.5f)
                horizontalLineTo(13.439f)
                lineTo(11.939f, 13f)
                horizontalLineTo(10.75f)
                curveTo(10.336f, 13f, 10f, 12.664f, 10f, 12.25f)
                curveTo(10f, 11.928f, 10.202f, 11.654f, 10.487f, 11.547f)
                lineTo(5.5f, 6.561f)
                verticalLineTo(20f)
                curveTo(5.5f, 20.275f, 5.724f, 20.5f, 6f, 20.5f)
                horizontalLineTo(18f)
                curveTo(18.276f, 20.5f, 18.5f, 20.275f, 18.5f, 20f)
                verticalLineTo(19.561f)
                close()
                moveTo(12f, 8f)
                curveTo(12f, 8.492f, 12.178f, 8.942f, 12.473f, 9.291f)
                lineTo(12.709f, 9.527f)
                curveTo(13.058f, 9.822f, 13.508f, 10f, 14f, 10f)
                horizontalLineTo(18.5f)
                verticalLineTo(15.318f)
                lineTo(20f, 16.818f)
                verticalLineTo(9.828f)
                curveTo(20f, 9.298f, 19.789f, 8.789f, 19.414f, 8.414f)
                lineTo(13.585f, 2.586f)
                curveTo(13.57f, 2.571f, 13.553f, 2.558f, 13.536f, 2.545f)
                curveTo(13.524f, 2.536f, 13.512f, 2.526f, 13.5f, 2.516f)
                curveTo(13.429f, 2.452f, 13.359f, 2.389f, 13.281f, 2.336f)
                curveTo(13.256f, 2.319f, 13.228f, 2.305f, 13.2f, 2.292f)
                curveTo(13.184f, 2.284f, 13.168f, 2.276f, 13.153f, 2.268f)
                curveTo(13.136f, 2.259f, 13.12f, 2.249f, 13.103f, 2.239f)
                curveTo(13.049f, 2.208f, 12.994f, 2.176f, 12.937f, 2.152f)
                curveTo(12.74f, 2.07f, 12.528f, 2.029f, 12.313f, 2.014f)
                curveTo(12.293f, 2.013f, 12.274f, 2.01f, 12.254f, 2.007f)
                curveTo(12.227f, 2.004f, 12.2f, 2f, 12.172f, 2f)
                horizontalLineTo(6f)
                curveTo(5.756f, 2f, 5.522f, 2.044f, 5.306f, 2.124f)
                lineTo(6.682f, 3.5f)
                horizontalLineTo(12f)
                verticalLineTo(8f)
                close()
                moveTo(13.5f, 4.621f)
                lineTo(17.378f, 8.5f)
                horizontalLineTo(14f)
                curveTo(13.724f, 8.5f, 13.5f, 8.275f, 13.5f, 8f)
                verticalLineTo(4.621f)
                close()
                moveTo(16.25f, 11.5f)
                horizontalLineTo(14.682f)
                lineTo(16.182f, 13f)
                horizontalLineTo(16.25f)
                curveTo(16.664f, 13f, 17f, 12.664f, 17f, 12.25f)
                curveTo(17f, 11.836f, 16.664f, 11.5f, 16.25f, 11.5f)
                close()
            }
        }.build()

        return _DocumentBulletListOff!!
    }

@Suppress("ObjectPropertyName")
private var _DocumentBulletListOff: ImageVector? = null

@Preview
@Composable
private fun DocumentBulletListOffPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.DocumentBulletListOff, contentDescription = null)
    }
}
