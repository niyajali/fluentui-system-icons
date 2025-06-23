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

public val FluentIcons.Regular.ArrowTurnRight: ImageVector
    get() {
        if (_ArrowTurnRight != null) {
            return _ArrowTurnRight!!
        }
        _ArrowTurnRight = ImageVector.Builder(
            name = "Regular.ArrowTurnRight",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(16.28f, 3.22f)
                curveTo(15.987f, 2.927f, 15.512f, 2.927f, 15.22f, 3.22f)
                curveTo(14.927f, 3.513f, 14.927f, 3.987f, 15.22f, 4.28f)
                lineTo(18.44f, 7.5f)
                horizontalLineTo(10.75f)
                curveTo(8.403f, 7.5f, 6.5f, 9.403f, 6.5f, 11.75f)
                verticalLineTo(20f)
                curveTo(6.5f, 20.414f, 6.836f, 20.75f, 7.25f, 20.75f)
                curveTo(7.664f, 20.75f, 8f, 20.414f, 8f, 20f)
                verticalLineTo(11.75f)
                curveTo(8f, 10.231f, 9.231f, 9f, 10.75f, 9f)
                horizontalLineTo(18.439f)
                lineTo(15.22f, 12.22f)
                curveTo(14.927f, 12.513f, 14.927f, 12.988f, 15.22f, 13.28f)
                curveTo(15.513f, 13.573f, 15.988f, 13.573f, 16.28f, 13.28f)
                lineTo(20.78f, 8.78f)
                curveTo(20.921f, 8.639f, 21f, 8.448f, 21f, 8.25f)
                curveTo(21f, 8.051f, 20.921f, 7.86f, 20.78f, 7.719f)
                lineTo(16.28f, 3.22f)
                close()
            }
        }.build()

        return _ArrowTurnRight!!
    }

@Suppress("ObjectPropertyName")
private var _ArrowTurnRight: ImageVector? = null

@Preview
@Composable
private fun ArrowTurnRightPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.ArrowTurnRight, contentDescription = null)
    }
}
