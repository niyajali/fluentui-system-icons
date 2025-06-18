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

public val FluentUi.Filled.Elevator: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.Elevator",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(12.75f, 20f)
            horizontalLineTo(18.75f)
            curveTo(20.545f, 20f, 22f, 18.545f, 22f, 16.75f)
            verticalLineTo(7.25f)
            curveTo(22f, 5.455f, 20.545f, 4f, 18.75f, 4f)
            horizontalLineTo(12.75f)
            lineTo(12.75f, 20f)
            close()
            moveTo(16.72f, 14.78f)
            lineTo(14.97f, 13.03f)
            curveTo(14.677f, 12.737f, 14.677f, 12.263f, 14.97f, 11.97f)
            curveTo(15.263f, 11.677f, 15.737f, 11.677f, 16.03f, 11.97f)
            lineTo(16.5f, 12.439f)
            verticalLineTo(9.5f)
            curveTo(16.5f, 9.086f, 16.836f, 8.75f, 17.25f, 8.75f)
            curveTo(17.664f, 8.75f, 18f, 9.086f, 18f, 9.5f)
            verticalLineTo(12.439f)
            lineTo(18.47f, 11.97f)
            curveTo(18.763f, 11.677f, 19.237f, 11.677f, 19.53f, 11.97f)
            curveTo(19.823f, 12.263f, 19.823f, 12.737f, 19.53f, 13.03f)
            lineTo(17.78f, 14.78f)
            curveTo(17.487f, 15.073f, 17.013f, 15.073f, 16.72f, 14.78f)
            close()
            moveTo(11.25f, 4f)
            horizontalLineTo(5.25f)
            curveTo(3.455f, 4f, 2f, 5.455f, 2f, 7.25f)
            verticalLineTo(16.75f)
            curveTo(2f, 18.545f, 3.455f, 20f, 5.25f, 20f)
            horizontalLineTo(11.25f)
            lineTo(11.25f, 4f)
            close()
            moveTo(7.28f, 8.97f)
            lineTo(9.03f, 10.72f)
            curveTo(9.323f, 11.013f, 9.323f, 11.487f, 9.03f, 11.78f)
            curveTo(8.737f, 12.073f, 8.263f, 12.073f, 7.97f, 11.78f)
            lineTo(7.5f, 11.311f)
            verticalLineTo(14.25f)
            curveTo(7.5f, 14.664f, 7.164f, 15f, 6.75f, 15f)
            curveTo(6.336f, 15f, 6f, 14.664f, 6f, 14.25f)
            verticalLineTo(11.311f)
            lineTo(5.53f, 11.78f)
            curveTo(5.237f, 12.073f, 4.763f, 12.073f, 4.47f, 11.78f)
            curveTo(4.177f, 11.487f, 4.177f, 11.013f, 4.47f, 10.72f)
            lineTo(6.22f, 8.97f)
            curveTo(6.513f, 8.677f, 6.987f, 8.677f, 7.28f, 8.97f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun ElevatorPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Filled.Elevator, contentDescription = null)
    }
}
