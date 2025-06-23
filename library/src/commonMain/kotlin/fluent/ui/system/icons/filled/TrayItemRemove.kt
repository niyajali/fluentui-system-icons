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

public val FluentIcons.Filled.TrayItemRemove: ImageVector
    get() {
        if (_TrayItemRemove != null) {
            return _TrayItemRemove!!
        }
        _TrayItemRemove = ImageVector.Builder(
            name = "Filled.TrayItemRemove",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(13.75f, 2f)
                curveTo(13.06f, 2f, 12.5f, 2.56f, 12.5f, 3.25f)
                verticalLineTo(5.75f)
                curveTo(12.5f, 6.44f, 13.06f, 7f, 13.75f, 7f)
                horizontalLineTo(17.75f)
                curveTo(18.44f, 7f, 19f, 6.44f, 19f, 5.75f)
                verticalLineTo(3.25f)
                curveTo(19f, 2.56f, 18.44f, 2f, 17.75f, 2f)
                horizontalLineTo(13.75f)
                close()
                moveTo(16.28f, 8.72f)
                curveTo(15.987f, 8.427f, 15.513f, 8.427f, 15.22f, 8.72f)
                lineTo(12.72f, 11.22f)
                curveTo(12.427f, 11.513f, 12.427f, 11.987f, 12.72f, 12.28f)
                curveTo(13.013f, 12.573f, 13.487f, 12.573f, 13.78f, 12.28f)
                lineTo(15f, 11.061f)
                verticalLineTo(17.75f)
                curveTo(15f, 18.164f, 15.336f, 18.5f, 15.75f, 18.5f)
                curveTo(16.164f, 18.5f, 16.5f, 18.164f, 16.5f, 17.75f)
                verticalLineTo(11.061f)
                lineTo(17.72f, 12.28f)
                curveTo(18.013f, 12.573f, 18.487f, 12.573f, 18.78f, 12.28f)
                curveTo(19.073f, 11.987f, 19.073f, 11.513f, 18.78f, 11.22f)
                lineTo(16.28f, 8.72f)
                close()
                moveTo(6.25f, 13.5f)
                curveTo(5.56f, 13.5f, 5f, 14.06f, 5f, 14.75f)
                verticalLineTo(17.25f)
                curveTo(5f, 17.94f, 5.56f, 18.5f, 6.25f, 18.5f)
                horizontalLineTo(10.25f)
                curveTo(10.94f, 18.5f, 11.5f, 17.94f, 11.5f, 17.25f)
                verticalLineTo(14.75f)
                curveTo(11.5f, 14.06f, 10.94f, 13.5f, 10.25f, 13.5f)
                horizontalLineTo(6.25f)
                close()
                moveTo(3.5f, 16.75f)
                curveTo(3.5f, 16.336f, 3.164f, 16f, 2.75f, 16f)
                curveTo(2.336f, 16f, 2f, 16.336f, 2f, 16.75f)
                verticalLineTo(18.75f)
                curveTo(2f, 20.269f, 3.231f, 21.5f, 4.75f, 21.5f)
                horizontalLineTo(19.25f)
                curveTo(20.769f, 21.5f, 22f, 20.269f, 22f, 18.75f)
                verticalLineTo(16.75f)
                curveTo(22f, 16.336f, 21.664f, 16f, 21.25f, 16f)
                curveTo(20.836f, 16f, 20.5f, 16.336f, 20.5f, 16.75f)
                verticalLineTo(18.75f)
                curveTo(20.5f, 19.44f, 19.94f, 20f, 19.25f, 20f)
                horizontalLineTo(4.75f)
                curveTo(4.06f, 20f, 3.5f, 19.44f, 3.5f, 18.75f)
                verticalLineTo(16.75f)
                close()
            }
        }.build()

        return _TrayItemRemove!!
    }

@Suppress("ObjectPropertyName")
private var _TrayItemRemove: ImageVector? = null

@Preview
@Composable
private fun TrayItemRemovePreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.TrayItemRemove, contentDescription = null)
    }
}
