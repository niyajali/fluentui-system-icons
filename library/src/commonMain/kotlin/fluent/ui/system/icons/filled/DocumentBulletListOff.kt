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
package fluent.ui.system.icons.filled

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

public val FluentIcons.Filled.DocumentBulletListOff: ImageVector
    get() {
        if (_DocumentBulletListOff != null) {
            return _DocumentBulletListOff!!
        }
        _DocumentBulletListOff = ImageVector.Builder(
            name = "Filled.DocumentBulletListOff",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(4f, 5.061f)
                verticalLineTo(20f)
                curveTo(4f, 21.105f, 4.895f, 22f, 6f, 22f)
                horizontalLineTo(18f)
                curveTo(18.795f, 22f, 19.481f, 21.536f, 19.804f, 20.865f)
                lineTo(20.719f, 21.781f)
                curveTo(21.012f, 22.073f, 21.487f, 22.073f, 21.78f, 21.781f)
                curveTo(22.073f, 21.488f, 22.073f, 21.013f, 21.78f, 20.72f)
                lineTo(3.28f, 2.22f)
                curveTo(2.987f, 1.927f, 2.513f, 1.927f, 2.22f, 2.22f)
                curveTo(1.927f, 2.513f, 1.927f, 2.987f, 2.22f, 3.28f)
                lineTo(4f, 5.061f)
                close()
                moveTo(16.473f, 17.534f)
                lineTo(16.966f, 18.027f)
                curveTo(16.988f, 18.098f, 17f, 18.173f, 17f, 18.25f)
                curveTo(17f, 18.664f, 16.664f, 19f, 16.25f, 19f)
                horizontalLineTo(10.75f)
                curveTo(10.336f, 19f, 10f, 18.664f, 10f, 18.25f)
                curveTo(10f, 17.836f, 10.336f, 17.5f, 10.75f, 17.5f)
                horizontalLineTo(16.25f)
                curveTo(16.327f, 17.5f, 16.402f, 17.512f, 16.473f, 17.534f)
                close()
                moveTo(14.939f, 16f)
                horizontalLineTo(10.75f)
                curveTo(10.336f, 16f, 10f, 15.664f, 10f, 15.25f)
                curveTo(10f, 14.836f, 10.336f, 14.5f, 10.75f, 14.5f)
                horizontalLineTo(13.439f)
                lineTo(14.939f, 16f)
                close()
                moveTo(11.939f, 13f)
                horizontalLineTo(10.75f)
                curveTo(10.336f, 13f, 10f, 12.664f, 10f, 12.25f)
                curveTo(10f, 11.928f, 10.202f, 11.654f, 10.487f, 11.547f)
                lineTo(11.939f, 13f)
                close()
                moveTo(7f, 12.25f)
                curveTo(7f, 11.836f, 7.336f, 11.5f, 7.75f, 11.5f)
                curveTo(8.164f, 11.5f, 8.5f, 11.836f, 8.5f, 12.25f)
                curveTo(8.5f, 12.664f, 8.164f, 13f, 7.75f, 13f)
                curveTo(7.336f, 13f, 7f, 12.664f, 7f, 12.25f)
                close()
                moveTo(7f, 15.25f)
                curveTo(7f, 14.836f, 7.336f, 14.5f, 7.75f, 14.5f)
                curveTo(8.164f, 14.5f, 8.5f, 14.836f, 8.5f, 15.25f)
                curveTo(8.5f, 15.664f, 8.164f, 16f, 7.75f, 16f)
                curveTo(7.336f, 16f, 7f, 15.664f, 7f, 15.25f)
                close()
                moveTo(7f, 18.25f)
                curveTo(7f, 17.836f, 7.336f, 17.5f, 7.75f, 17.5f)
                curveTo(8.164f, 17.5f, 8.5f, 17.836f, 8.5f, 18.25f)
                curveTo(8.5f, 18.664f, 8.164f, 19f, 7.75f, 19f)
                curveTo(7.336f, 19f, 7f, 18.664f, 7f, 18.25f)
                close()
                moveTo(16.25f, 13f)
                horizontalLineTo(16.182f)
                lineTo(20f, 16.818f)
                verticalLineTo(10f)
                horizontalLineTo(14f)
                curveTo(13.509f, 10f, 13.06f, 9.823f, 12.712f, 9.53f)
                lineTo(14.682f, 11.5f)
                horizontalLineTo(16.25f)
                curveTo(16.664f, 11.5f, 17f, 11.836f, 17f, 12.25f)
                curveTo(17f, 12.664f, 16.664f, 13f, 16.25f, 13f)
                close()
                moveTo(12f, 8f)
                curveTo(12f, 8.491f, 12.177f, 8.94f, 12.47f, 9.288f)
                lineTo(5.306f, 2.124f)
                curveTo(5.522f, 2.044f, 5.756f, 2f, 6f, 2f)
                horizontalLineTo(12f)
                verticalLineTo(8f)
                close()
                moveTo(13.5f, 8f)
                verticalLineTo(2.5f)
                lineTo(19.5f, 8.5f)
                horizontalLineTo(14f)
                curveTo(13.724f, 8.5f, 13.5f, 8.276f, 13.5f, 8f)
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
        Image(imageVector = FluentIcons.Filled.DocumentBulletListOff, contentDescription = null)
    }
}
