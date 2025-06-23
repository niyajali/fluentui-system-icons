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

public val FluentIcons.Regular.PollOff: ImageVector
    get() {
        if (_PollOff != null) {
            return _PollOff!!
        }
        _PollOff = ImageVector.Builder(
            name = "Regular.PollOff",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(9f, 10.061f)
                lineTo(2.22f, 3.28f)
                curveTo(1.927f, 2.987f, 1.927f, 2.513f, 2.22f, 2.22f)
                curveTo(2.513f, 1.927f, 2.987f, 1.927f, 3.28f, 2.22f)
                lineTo(21.78f, 20.72f)
                curveTo(22.073f, 21.013f, 22.073f, 21.488f, 21.78f, 21.781f)
                curveTo(21.487f, 22.073f, 21.012f, 22.073f, 20.719f, 21.781f)
                lineTo(20.396f, 21.457f)
                curveTo(19.937f, 21.799f, 19.368f, 22.002f, 18.752f, 22.002f)
                curveTo(17.232f, 22.002f, 16f, 20.77f, 16f, 19.25f)
                verticalLineTo(17.061f)
                lineTo(14.504f, 15.565f)
                verticalLineTo(19.25f)
                curveTo(14.504f, 20.77f, 13.272f, 22.002f, 11.752f, 22.002f)
                curveTo(10.232f, 22.002f, 9f, 20.77f, 9f, 19.25f)
                verticalLineTo(10.061f)
                close()
                moveTo(13.004f, 14.065f)
                lineTo(10.5f, 11.561f)
                verticalLineTo(19.25f)
                curveTo(10.5f, 19.941f, 11.061f, 20.502f, 11.752f, 20.502f)
                curveTo(12.443f, 20.502f, 13.004f, 19.941f, 13.004f, 19.25f)
                verticalLineTo(14.065f)
                close()
                moveTo(17.5f, 18.561f)
                verticalLineTo(19.25f)
                curveTo(17.5f, 19.941f, 18.06f, 20.502f, 18.752f, 20.502f)
                curveTo(18.952f, 20.502f, 19.142f, 20.455f, 19.31f, 20.371f)
                lineTo(17.5f, 18.561f)
                close()
                moveTo(13.004f, 4.751f)
                verticalLineTo(9.822f)
                lineTo(14.504f, 11.322f)
                verticalLineTo(4.751f)
                curveTo(14.504f, 3.232f, 13.272f, 2f, 11.752f, 2f)
                curveTo(10.232f, 2f, 9f, 3.232f, 9f, 4.751f)
                verticalLineTo(5.818f)
                lineTo(10.5f, 7.318f)
                verticalLineTo(4.751f)
                curveTo(10.5f, 4.06f, 11.061f, 3.5f, 11.752f, 3.5f)
                curveTo(12.443f, 3.5f, 13.004f, 4.06f, 13.004f, 4.751f)
                close()
                moveTo(16f, 12.818f)
                lineTo(17.5f, 14.318f)
                verticalLineTo(9.751f)
                curveTo(17.5f, 9.06f, 18.06f, 8.5f, 18.752f, 8.5f)
                curveTo(19.443f, 8.5f, 20.004f, 9.06f, 20.004f, 9.751f)
                verticalLineTo(16.822f)
                lineTo(21.504f, 18.322f)
                verticalLineTo(9.751f)
                curveTo(21.504f, 8.232f, 20.272f, 7f, 18.752f, 7f)
                curveTo(17.232f, 7f, 16f, 8.232f, 16f, 9.751f)
                verticalLineTo(12.818f)
                close()
                moveTo(4.752f, 12f)
                curveTo(6.272f, 12f, 7.504f, 13.232f, 7.504f, 14.751f)
                verticalLineTo(19.25f)
                curveTo(7.504f, 20.77f, 6.272f, 22.002f, 4.752f, 22.002f)
                curveTo(3.232f, 22.002f, 2f, 20.77f, 2f, 19.25f)
                verticalLineTo(14.751f)
                curveTo(2f, 13.232f, 3.232f, 12f, 4.752f, 12f)
                close()
                moveTo(4.752f, 13.5f)
                curveTo(4.06f, 13.5f, 3.5f, 14.06f, 3.5f, 14.751f)
                verticalLineTo(19.25f)
                curveTo(3.5f, 19.941f, 4.06f, 20.502f, 4.752f, 20.502f)
                curveTo(5.443f, 20.502f, 6.004f, 19.941f, 6.004f, 19.25f)
                verticalLineTo(14.751f)
                curveTo(6.004f, 14.06f, 5.443f, 13.5f, 4.752f, 13.5f)
                close()
            }
        }.build()

        return _PollOff!!
    }

@Suppress("ObjectPropertyName")
private var _PollOff: ImageVector? = null

@Preview
@Composable
private fun PollOffPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.PollOff, contentDescription = null)
    }
}
