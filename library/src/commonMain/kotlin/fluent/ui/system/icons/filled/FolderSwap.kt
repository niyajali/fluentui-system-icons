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

public val FluentUi.Filled.FolderSwap: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.FolderSwap",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(2f, 6.25f)
            verticalLineTo(8f)
            horizontalLineTo(8.129f)
            curveTo(8.328f, 8f, 8.518f, 7.921f, 8.659f, 7.78f)
            lineTo(11.25f, 5.189f)
            lineTo(9.72f, 3.659f)
            curveTo(9.298f, 3.237f, 8.725f, 3f, 8.129f, 3f)
            horizontalLineTo(5.25f)
            curveTo(3.455f, 3f, 2f, 4.455f, 2f, 6.25f)
            close()
            moveTo(2f, 17.75f)
            verticalLineTo(9.5f)
            horizontalLineTo(8.129f)
            curveTo(8.725f, 9.5f, 9.298f, 9.263f, 9.72f, 8.841f)
            lineTo(13.061f, 5.5f)
            horizontalLineTo(18.75f)
            curveTo(20.545f, 5.5f, 22f, 6.955f, 22f, 8.75f)
            verticalLineTo(16.025f)
            lineTo(20.987f, 15.013f)
            curveTo(20.304f, 14.329f, 19.196f, 14.329f, 18.513f, 15.013f)
            curveTo(17.975f, 15.55f, 17.86f, 16.35f, 18.168f, 17f)
            horizontalLineTo(16.832f)
            curveTo(17.14f, 16.35f, 17.025f, 15.55f, 16.487f, 15.013f)
            curveTo(15.804f, 14.329f, 14.696f, 14.329f, 14.013f, 15.013f)
            lineTo(11.513f, 17.513f)
            curveTo(10.829f, 18.196f, 10.829f, 19.304f, 11.513f, 19.987f)
            lineTo(12.525f, 21f)
            horizontalLineTo(5.25f)
            curveTo(3.455f, 21f, 2f, 19.545f, 2f, 17.75f)
            close()
            moveTo(15.78f, 16.78f)
            curveTo(16.073f, 16.487f, 16.073f, 16.013f, 15.78f, 15.72f)
            curveTo(15.487f, 15.427f, 15.013f, 15.427f, 14.72f, 15.72f)
            lineTo(12.22f, 18.22f)
            curveTo(11.927f, 18.513f, 11.927f, 18.987f, 12.22f, 19.28f)
            lineTo(14.72f, 21.78f)
            curveTo(15.013f, 22.073f, 15.487f, 22.073f, 15.78f, 21.78f)
            curveTo(16.073f, 21.487f, 16.073f, 21.013f, 15.78f, 20.72f)
            lineTo(14.561f, 19.5f)
            horizontalLineTo(20.439f)
            lineTo(19.22f, 20.72f)
            curveTo(18.927f, 21.013f, 18.927f, 21.487f, 19.22f, 21.78f)
            curveTo(19.513f, 22.073f, 19.987f, 22.073f, 20.28f, 21.78f)
            lineTo(22.78f, 19.28f)
            curveTo(23.073f, 18.987f, 23.073f, 18.513f, 22.78f, 18.22f)
            lineTo(20.28f, 15.72f)
            curveTo(19.987f, 15.427f, 19.513f, 15.427f, 19.22f, 15.72f)
            curveTo(18.927f, 16.013f, 18.927f, 16.487f, 19.22f, 16.78f)
            lineTo(20.439f, 18f)
            horizontalLineTo(14.561f)
            lineTo(15.78f, 16.78f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun FolderSwapPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Filled.FolderSwap, contentDescription = null)
    }
}
