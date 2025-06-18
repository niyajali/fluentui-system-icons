/**
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
import fluent.ui.system.icons.FluentUi

public val FluentUi.Regular.FolderSwap: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.FolderSwap",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(3.5f, 8f)
            verticalLineTo(6.25f)
            curveTo(3.5f, 5.284f, 4.284f, 4.5f, 5.25f, 4.5f)
            horizontalLineTo(8.129f)
            curveTo(8.328f, 4.5f, 8.518f, 4.579f, 8.659f, 4.72f)
            lineTo(10.189f, 6.25f)
            lineTo(8.659f, 7.78f)
            curveTo(8.518f, 7.921f, 8.328f, 8f, 8.129f, 8f)
            horizontalLineTo(3.5f)
            close()
            moveTo(5.25f, 3f)
            curveTo(3.455f, 3f, 2f, 4.455f, 2f, 6.25f)
            verticalLineTo(17.75f)
            curveTo(2f, 19.545f, 3.455f, 21f, 5.25f, 21f)
            horizontalLineTo(12.525f)
            lineTo(11.513f, 19.987f)
            curveTo(11.367f, 19.842f, 11.252f, 19.676f, 11.168f, 19.5f)
            horizontalLineTo(5.25f)
            curveTo(4.284f, 19.5f, 3.5f, 18.716f, 3.5f, 17.75f)
            verticalLineTo(9.5f)
            horizontalLineTo(8.129f)
            curveTo(8.725f, 9.5f, 9.298f, 9.263f, 9.72f, 8.841f)
            lineTo(11.561f, 7f)
            horizontalLineTo(18.75f)
            curveTo(19.716f, 7f, 20.5f, 7.784f, 20.5f, 8.75f)
            verticalLineTo(14.668f)
            curveTo(20.676f, 14.752f, 20.842f, 14.867f, 20.987f, 15.013f)
            lineTo(22f, 16.025f)
            verticalLineTo(8.75f)
            curveTo(22f, 6.955f, 20.545f, 5.5f, 18.75f, 5.5f)
            horizontalLineTo(11.561f)
            lineTo(9.72f, 3.659f)
            curveTo(9.298f, 3.237f, 8.725f, 3f, 8.129f, 3f)
            horizontalLineTo(5.25f)
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
        Image(imageVector = FluentUi.Regular.FolderSwap, contentDescription = null)
    }
}
