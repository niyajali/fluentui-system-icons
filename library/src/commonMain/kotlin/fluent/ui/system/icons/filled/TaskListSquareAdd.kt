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
import androidx.compose.ui.unit.dp
import fluent.ui.system.icons.FluentUi
import org.jetbrains.compose.ui.tooling.preview.Preview

public val FluentUi.Filled.TaskListSquareAdd: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.TaskListSquareAdd",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(3f, 6.25f)
            curveTo(3f, 4.455f, 4.455f, 3f, 6.25f, 3f)
            horizontalLineTo(17.75f)
            curveTo(19.545f, 3f, 21f, 4.455f, 21f, 6.25f)
            verticalLineTo(12.022f)
            curveTo(19.99f, 11.375f, 18.789f, 11f, 17.5f, 11f)
            curveTo(13.91f, 11f, 11f, 13.91f, 11f, 17.5f)
            curveTo(11f, 18.789f, 11.375f, 19.99f, 12.022f, 21f)
            horizontalLineTo(6.25f)
            curveTo(4.455f, 21f, 3f, 19.545f, 3f, 17.75f)
            verticalLineTo(6.25f)
            close()
            moveTo(12.5f, 9.25f)
            curveTo(12.5f, 9.664f, 12.836f, 10f, 13.25f, 10f)
            horizontalLineTo(16.75f)
            curveTo(17.164f, 10f, 17.5f, 9.664f, 17.5f, 9.25f)
            curveTo(17.5f, 8.836f, 17.164f, 8.5f, 16.75f, 8.5f)
            horizontalLineTo(13.25f)
            curveTo(12.836f, 8.5f, 12.5f, 8.836f, 12.5f, 9.25f)
            close()
            moveTo(10.78f, 8.78f)
            curveTo(11.073f, 8.487f, 11.073f, 8.013f, 10.78f, 7.72f)
            curveTo(10.487f, 7.427f, 10.013f, 7.427f, 9.72f, 7.72f)
            lineTo(8.25f, 9.189f)
            lineTo(7.78f, 8.72f)
            curveTo(7.487f, 8.427f, 7.013f, 8.427f, 6.72f, 8.72f)
            curveTo(6.427f, 9.013f, 6.427f, 9.487f, 6.72f, 9.78f)
            lineTo(7.72f, 10.78f)
            curveTo(8.013f, 11.073f, 8.487f, 11.073f, 8.78f, 10.78f)
            lineTo(10.78f, 8.78f)
            close()
            moveTo(10.78f, 13.22f)
            curveTo(10.487f, 12.927f, 10.013f, 12.927f, 9.72f, 13.22f)
            lineTo(8.25f, 14.689f)
            lineTo(7.78f, 14.22f)
            curveTo(7.487f, 13.927f, 7.013f, 13.927f, 6.72f, 14.22f)
            curveTo(6.427f, 14.513f, 6.427f, 14.987f, 6.72f, 15.28f)
            lineTo(7.72f, 16.28f)
            curveTo(8.013f, 16.573f, 8.487f, 16.573f, 8.78f, 16.28f)
            lineTo(10.78f, 14.28f)
            curveTo(11.073f, 13.987f, 11.073f, 13.513f, 10.78f, 13.22f)
            close()
            moveTo(23f, 17.5f)
            curveTo(23f, 14.462f, 20.538f, 12f, 17.5f, 12f)
            curveTo(14.462f, 12f, 12f, 14.462f, 12f, 17.5f)
            curveTo(12f, 20.538f, 14.462f, 23f, 17.5f, 23f)
            curveTo(20.538f, 23f, 23f, 20.538f, 23f, 17.5f)
            close()
            moveTo(18.001f, 18f)
            lineTo(18.001f, 20.503f)
            curveTo(18.001f, 20.78f, 17.777f, 21.003f, 17.501f, 21.003f)
            curveTo(17.225f, 21.003f, 17.001f, 20.78f, 17.001f, 20.503f)
            lineTo(17.001f, 18f)
            horizontalLineTo(14.496f)
            curveTo(14.22f, 18f, 13.996f, 17.776f, 13.996f, 17.5f)
            curveTo(13.996f, 17.224f, 14.22f, 17f, 14.496f, 17f)
            horizontalLineTo(17f)
            lineTo(17f, 14.499f)
            curveTo(17f, 14.223f, 17.224f, 13.999f, 17.5f, 13.999f)
            curveTo(17.776f, 13.999f, 18f, 14.223f, 18f, 14.499f)
            lineTo(18f, 17f)
            horizontalLineTo(20.497f)
            curveTo(20.772f, 17f, 20.996f, 17.224f, 20.996f, 17.5f)
            curveTo(20.996f, 17.776f, 20.772f, 18f, 20.497f, 18f)
            horizontalLineTo(18.001f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun TaskListSquareAddPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Filled.TaskListSquareAdd, contentDescription = null)
    }
}
