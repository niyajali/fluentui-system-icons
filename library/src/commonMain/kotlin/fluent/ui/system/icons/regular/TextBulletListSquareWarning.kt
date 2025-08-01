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

public val FluentIcons.Regular.TextBulletListSquareWarning: ImageVector
    get() {
        if (_TextBulletListSquareWarning != null) {
            return _TextBulletListSquareWarning!!
        }
        _TextBulletListSquareWarning = ImageVector.Builder(
            name = "Regular.TextBulletListSquareWarning",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(7.75f, 9.25f)
                curveTo(8.302f, 9.25f, 8.75f, 8.802f, 8.75f, 8.25f)
                curveTo(8.75f, 7.698f, 8.302f, 7.25f, 7.75f, 7.25f)
                curveTo(7.198f, 7.25f, 6.75f, 7.698f, 6.75f, 8.25f)
                curveTo(6.75f, 8.802f, 7.198f, 9.25f, 7.75f, 9.25f)
                close()
                moveTo(11.25f, 7.5f)
                curveTo(10.836f, 7.5f, 10.5f, 7.836f, 10.5f, 8.25f)
                curveTo(10.5f, 8.664f, 10.836f, 9f, 11.25f, 9f)
                horizontalLineTo(16.75f)
                curveTo(17.164f, 9f, 17.5f, 8.664f, 17.5f, 8.25f)
                curveTo(17.5f, 7.836f, 17.164f, 7.5f, 16.75f, 7.5f)
                horizontalLineTo(11.25f)
                close()
                moveTo(11.25f, 11.25f)
                curveTo(10.836f, 11.25f, 10.5f, 11.586f, 10.5f, 12f)
                curveTo(10.5f, 12.414f, 10.836f, 12.75f, 11.25f, 12.75f)
                horizontalLineTo(15.082f)
                lineTo(15.266f, 12.383f)
                curveTo(15.53f, 11.853f, 15.937f, 11.475f, 16.403f, 11.25f)
                horizontalLineTo(11.25f)
                close()
                moveTo(11.25f, 15f)
                horizontalLineTo(13.958f)
                lineTo(13.209f, 16.5f)
                horizontalLineTo(11.25f)
                curveTo(10.836f, 16.5f, 10.5f, 16.164f, 10.5f, 15.75f)
                curveTo(10.5f, 15.336f, 10.836f, 15f, 11.25f, 15f)
                close()
                moveTo(6.25f, 19.5f)
                horizontalLineTo(11.71f)
                lineTo(11.27f, 20.381f)
                curveTo(11.168f, 20.584f, 11.097f, 20.792f, 11.054f, 21f)
                horizontalLineTo(6.25f)
                curveTo(4.455f, 21f, 3f, 19.545f, 3f, 17.75f)
                verticalLineTo(6.25f)
                curveTo(3f, 4.455f, 4.455f, 3f, 6.25f, 3f)
                horizontalLineTo(17.75f)
                curveTo(19.545f, 3f, 21f, 4.455f, 21f, 6.25f)
                verticalLineTo(14.905f)
                lineTo(19.74f, 12.383f)
                curveTo(19.67f, 12.242f, 19.589f, 12.111f, 19.5f, 11.992f)
                verticalLineTo(6.25f)
                curveTo(19.5f, 5.284f, 18.716f, 4.5f, 17.75f, 4.5f)
                horizontalLineTo(6.25f)
                curveTo(5.284f, 4.5f, 4.5f, 5.284f, 4.5f, 6.25f)
                verticalLineTo(17.75f)
                curveTo(4.5f, 18.716f, 5.284f, 19.5f, 6.25f, 19.5f)
                close()
                moveTo(8.75f, 12f)
                curveTo(8.75f, 12.552f, 8.302f, 13f, 7.75f, 13f)
                curveTo(7.198f, 13f, 6.75f, 12.552f, 6.75f, 12f)
                curveTo(6.75f, 11.448f, 7.198f, 11f, 7.75f, 11f)
                curveTo(8.302f, 11f, 8.75f, 11.448f, 8.75f, 12f)
                close()
                moveTo(7.75f, 16.75f)
                curveTo(8.302f, 16.75f, 8.75f, 16.302f, 8.75f, 15.75f)
                curveTo(8.75f, 15.198f, 8.302f, 14.75f, 7.75f, 14.75f)
                curveTo(7.198f, 14.75f, 6.75f, 15.198f, 6.75f, 15.75f)
                curveTo(6.75f, 16.302f, 7.198f, 16.75f, 7.75f, 16.75f)
                close()
                moveTo(16.161f, 12.83f)
                curveTo(16.714f, 11.723f, 18.294f, 11.723f, 18.847f, 12.83f)
                lineTo(22.844f, 20.828f)
                curveTo(23.342f, 21.826f, 22.617f, 23f, 21.501f, 23f)
                horizontalLineTo(13.507f)
                curveTo(12.391f, 23f, 11.665f, 21.826f, 12.164f, 20.828f)
                lineTo(16.161f, 12.83f)
                close()
                moveTo(18.004f, 15.496f)
                curveTo(18.004f, 15.219f, 17.78f, 14.995f, 17.504f, 14.995f)
                curveTo(17.228f, 14.995f, 17.003f, 15.219f, 17.003f, 15.496f)
                verticalLineTo(18.497f)
                curveTo(17.003f, 18.774f, 17.228f, 18.998f, 17.504f, 18.998f)
                curveTo(17.78f, 18.998f, 18.004f, 18.774f, 18.004f, 18.497f)
                verticalLineTo(15.496f)
                close()
                moveTo(17.504f, 20.999f)
                curveTo(17.78f, 20.999f, 18.004f, 20.775f, 18.004f, 20.499f)
                curveTo(18.004f, 20.222f, 17.78f, 19.998f, 17.504f, 19.998f)
                curveTo(17.228f, 19.998f, 17.003f, 20.222f, 17.003f, 20.499f)
                curveTo(17.003f, 20.775f, 17.228f, 20.999f, 17.504f, 20.999f)
                close()
            }
        }.build()

        return _TextBulletListSquareWarning!!
    }

@Suppress("ObjectPropertyName")
private var _TextBulletListSquareWarning: ImageVector? = null

@Preview
@Composable
private fun TextBulletListSquareWarningPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.TextBulletListSquareWarning, contentDescription = null)
    }
}
