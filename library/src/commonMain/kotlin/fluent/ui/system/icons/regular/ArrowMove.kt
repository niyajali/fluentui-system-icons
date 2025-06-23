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

public val FluentIcons.Regular.ArrowMove: ImageVector
    get() {
        if (_ArrowMove != null) {
            return _ArrowMove!!
        }
        _ArrowMove = ImageVector.Builder(
            name = "Regular.ArrowMove",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(15.28f, 6.03f)
                curveTo(14.987f, 6.323f, 14.513f, 6.323f, 14.22f, 6.03f)
                lineTo(12.75f, 4.561f)
                lineTo(12.75f, 8.25f)
                curveTo(12.75f, 8.664f, 12.414f, 9f, 12f, 9f)
                curveTo(11.586f, 9f, 11.25f, 8.664f, 11.25f, 8.25f)
                lineTo(11.25f, 4.561f)
                lineTo(9.78f, 6.03f)
                curveTo(9.487f, 6.323f, 9.013f, 6.323f, 8.72f, 6.03f)
                curveTo(8.427f, 5.737f, 8.427f, 5.263f, 8.72f, 4.97f)
                lineTo(11.47f, 2.22f)
                curveTo(11.61f, 2.079f, 11.801f, 2f, 12f, 2f)
                curveTo(12.199f, 2f, 12.39f, 2.079f, 12.53f, 2.22f)
                lineTo(15.28f, 4.97f)
                curveTo(15.573f, 5.263f, 15.573f, 5.737f, 15.28f, 6.03f)
                close()
                moveTo(6.03f, 14.22f)
                curveTo(6.323f, 14.513f, 6.323f, 14.987f, 6.03f, 15.28f)
                curveTo(5.737f, 15.573f, 5.263f, 15.573f, 4.97f, 15.28f)
                lineTo(2.22f, 12.53f)
                curveTo(2.079f, 12.39f, 2f, 12.199f, 2f, 12f)
                curveTo(2f, 11.801f, 2.079f, 11.61f, 2.22f, 11.47f)
                lineTo(4.97f, 8.72f)
                curveTo(5.263f, 8.427f, 5.737f, 8.427f, 6.03f, 8.72f)
                curveTo(6.323f, 9.013f, 6.323f, 9.487f, 6.03f, 9.78f)
                lineTo(4.561f, 11.25f)
                horizontalLineTo(8.25f)
                curveTo(8.664f, 11.25f, 9f, 11.586f, 9f, 12f)
                curveTo(9f, 12.414f, 8.664f, 12.75f, 8.25f, 12.75f)
                horizontalLineTo(4.561f)
                lineTo(6.03f, 14.22f)
                close()
                moveTo(17.97f, 15.28f)
                curveTo(17.677f, 14.987f, 17.677f, 14.513f, 17.97f, 14.22f)
                lineTo(19.439f, 12.75f)
                horizontalLineTo(15.75f)
                curveTo(15.336f, 12.75f, 15f, 12.414f, 15f, 12f)
                curveTo(15f, 11.586f, 15.336f, 11.25f, 15.75f, 11.25f)
                horizontalLineTo(19.439f)
                lineTo(17.97f, 9.78f)
                curveTo(17.677f, 9.487f, 17.677f, 9.013f, 17.97f, 8.72f)
                curveTo(18.263f, 8.427f, 18.737f, 8.427f, 19.03f, 8.72f)
                lineTo(21.78f, 11.47f)
                curveTo(21.921f, 11.61f, 22f, 11.801f, 22f, 12f)
                curveTo(22f, 12.199f, 21.921f, 12.39f, 21.78f, 12.53f)
                lineTo(19.03f, 15.28f)
                curveTo(18.737f, 15.573f, 18.263f, 15.573f, 17.97f, 15.28f)
                close()
                moveTo(15.28f, 17.97f)
                curveTo(14.987f, 17.677f, 14.513f, 17.677f, 14.22f, 17.97f)
                lineTo(12.75f, 19.439f)
                lineTo(12.75f, 15.75f)
                curveTo(12.75f, 15.336f, 12.414f, 15f, 12f, 15f)
                curveTo(11.586f, 15f, 11.25f, 15.336f, 11.25f, 15.75f)
                lineTo(11.25f, 19.439f)
                lineTo(9.78f, 17.97f)
                curveTo(9.487f, 17.677f, 9.013f, 17.677f, 8.72f, 17.97f)
                curveTo(8.427f, 18.263f, 8.427f, 18.737f, 8.72f, 19.03f)
                lineTo(11.47f, 21.78f)
                curveTo(11.61f, 21.921f, 11.801f, 22f, 12f, 22f)
                curveTo(12.199f, 22f, 12.39f, 21.921f, 12.53f, 21.78f)
                lineTo(15.28f, 19.03f)
                curveTo(15.573f, 18.737f, 15.573f, 18.263f, 15.28f, 17.97f)
                close()
            }
        }.build()

        return _ArrowMove!!
    }

@Suppress("ObjectPropertyName")
private var _ArrowMove: ImageVector? = null

@Preview
@Composable
private fun ArrowMovePreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.ArrowMove, contentDescription = null)
    }
}
