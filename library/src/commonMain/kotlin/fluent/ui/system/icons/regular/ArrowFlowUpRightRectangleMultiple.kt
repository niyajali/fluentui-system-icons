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

public val FluentIcons.Regular.ArrowFlowUpRightRectangleMultiple: ImageVector
    get() {
        if (_ArrowFlowUpRightRectangleMultiple != null) {
            return _ArrowFlowUpRightRectangleMultiple!!
        }
        _ArrowFlowUpRightRectangleMultiple = ImageVector.Builder(
            name = "Regular.ArrowFlowUpRightRectangleMultiple",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(14f, 16f)
                curveTo(14f, 15.448f, 14.448f, 15f, 15f, 15f)
                horizontalLineTo(20f)
                curveTo(20.552f, 15f, 21f, 15.448f, 21f, 16f)
                verticalLineTo(20f)
                curveTo(21f, 20.552f, 20.552f, 21f, 20f, 21f)
                horizontalLineTo(15f)
                curveTo(14.448f, 21f, 14f, 20.552f, 14f, 20f)
                verticalLineTo(16f)
                close()
                moveTo(23f, 17.5f)
                curveTo(23f, 17.224f, 22.776f, 17f, 22.5f, 17f)
                curveTo(22.224f, 17f, 22f, 17.224f, 22f, 17.5f)
                verticalLineTo(20.5f)
                curveTo(22f, 21.328f, 21.328f, 22f, 20.5f, 22f)
                horizontalLineTo(16.5f)
                curveTo(16.224f, 22f, 16f, 22.224f, 16f, 22.5f)
                curveTo(16f, 22.776f, 16.224f, 23f, 16.5f, 23f)
                horizontalLineTo(20.5f)
                curveTo(21.881f, 23f, 23f, 21.881f, 23f, 20.5f)
                verticalLineTo(17.5f)
                close()
                moveTo(17.53f, 3.22f)
                curveTo(17.237f, 2.927f, 16.763f, 2.927f, 16.47f, 3.22f)
                curveTo(16.177f, 3.513f, 16.177f, 3.987f, 16.47f, 4.28f)
                lineTo(19.439f, 7.25f)
                horizontalLineTo(14.5f)
                curveTo(12.705f, 7.25f, 11.25f, 8.705f, 11.25f, 10.5f)
                verticalLineTo(13.5f)
                curveTo(11.25f, 14.322f, 10.684f, 15.011f, 9.92f, 15.199f)
                curveTo(9.549f, 13.374f, 7.935f, 12f, 6f, 12f)
                curveTo(3.791f, 12f, 2f, 13.791f, 2f, 16f)
                curveTo(2f, 18.209f, 3.791f, 20f, 6f, 20f)
                curveTo(7.963f, 20f, 9.596f, 18.586f, 9.935f, 16.721f)
                curveTo(11.524f, 16.508f, 12.75f, 15.147f, 12.75f, 13.5f)
                verticalLineTo(10.5f)
                curveTo(12.75f, 9.533f, 13.533f, 8.75f, 14.5f, 8.75f)
                horizontalLineTo(19.439f)
                lineTo(16.47f, 11.72f)
                curveTo(16.177f, 12.013f, 16.177f, 12.487f, 16.47f, 12.78f)
                curveTo(16.763f, 13.073f, 17.237f, 13.073f, 17.53f, 12.78f)
                lineTo(21.78f, 8.53f)
                curveTo(22.073f, 8.237f, 22.073f, 7.763f, 21.78f, 7.47f)
                lineTo(17.53f, 3.22f)
                close()
                moveTo(3.5f, 16f)
                curveTo(3.5f, 14.619f, 4.619f, 13.5f, 6f, 13.5f)
                curveTo(7.381f, 13.5f, 8.5f, 14.619f, 8.5f, 16f)
                curveTo(8.5f, 17.381f, 7.381f, 18.5f, 6f, 18.5f)
                curveTo(4.619f, 18.5f, 3.5f, 17.381f, 3.5f, 16f)
                close()
            }
        }.build()

        return _ArrowFlowUpRightRectangleMultiple!!
    }

@Suppress("ObjectPropertyName")
private var _ArrowFlowUpRightRectangleMultiple: ImageVector? = null

@Preview
@Composable
private fun ArrowFlowUpRightRectangleMultiplePreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.ArrowFlowUpRightRectangleMultiple, contentDescription = null)
    }
}
