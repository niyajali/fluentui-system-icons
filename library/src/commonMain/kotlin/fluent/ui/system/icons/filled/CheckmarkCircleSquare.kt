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
import fluent.ui.system.icons.FluentIcons
import org.jetbrains.compose.ui.tooling.preview.Preview

public val FluentIcons.Filled.CheckmarkCircleSquare: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.CheckmarkCircleSquare",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(8.5f, 16f)
            curveTo(12.642f, 16f, 16f, 12.642f, 16f, 8.5f)
            curveTo(16f, 4.358f, 12.642f, 1f, 8.5f, 1f)
            curveTo(4.358f, 1f, 1f, 4.358f, 1f, 8.5f)
            curveTo(1f, 12.642f, 4.358f, 16f, 8.5f, 16f)
            close()
            moveTo(12.28f, 6.78f)
            lineTo(8.28f, 10.78f)
            curveTo(7.987f, 11.073f, 7.513f, 11.073f, 7.22f, 10.78f)
            lineTo(5.22f, 8.78f)
            curveTo(4.927f, 8.487f, 4.927f, 8.013f, 5.22f, 7.72f)
            curveTo(5.513f, 7.427f, 5.987f, 7.427f, 6.28f, 7.72f)
            lineTo(7.75f, 9.189f)
            lineTo(11.22f, 5.72f)
            curveTo(11.513f, 5.427f, 11.987f, 5.427f, 12.28f, 5.72f)
            curveTo(12.573f, 6.013f, 12.573f, 6.487f, 12.28f, 6.78f)
            close()
            moveTo(20.28f, 13.72f)
            curveTo(20.573f, 14.013f, 20.573f, 14.487f, 20.28f, 14.78f)
            lineTo(16.28f, 18.78f)
            curveTo(15.987f, 19.073f, 15.513f, 19.073f, 15.22f, 18.78f)
            lineTo(13.22f, 16.78f)
            curveTo(12.927f, 16.487f, 12.927f, 16.013f, 13.22f, 15.72f)
            curveTo(13.513f, 15.427f, 13.987f, 15.427f, 14.28f, 15.72f)
            lineTo(15.75f, 17.189f)
            lineTo(19.22f, 13.72f)
            curveTo(19.513f, 13.427f, 19.987f, 13.427f, 20.28f, 13.72f)
            close()
            moveTo(9.75f, 20f)
            verticalLineTo(16.909f)
            curveTo(10.267f, 16.833f, 10.768f, 16.71f, 11.25f, 16.545f)
            verticalLineTo(20f)
            curveTo(11.25f, 20.966f, 12.033f, 21.75f, 13f, 21.75f)
            horizontalLineTo(20f)
            curveTo(20.966f, 21.75f, 21.75f, 20.966f, 21.75f, 20f)
            verticalLineTo(13f)
            curveTo(21.75f, 12.033f, 20.966f, 11.25f, 20f, 11.25f)
            horizontalLineTo(16.545f)
            curveTo(16.71f, 10.768f, 16.833f, 10.267f, 16.909f, 9.75f)
            horizontalLineTo(20f)
            curveTo(21.795f, 9.75f, 23.25f, 11.205f, 23.25f, 13f)
            verticalLineTo(20f)
            curveTo(23.25f, 21.795f, 21.795f, 23.25f, 20f, 23.25f)
            horizontalLineTo(13f)
            curveTo(11.205f, 23.25f, 9.75f, 21.795f, 9.75f, 20f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun CheckmarkCircleSquarePreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.CheckmarkCircleSquare, contentDescription = null)
    }
}
