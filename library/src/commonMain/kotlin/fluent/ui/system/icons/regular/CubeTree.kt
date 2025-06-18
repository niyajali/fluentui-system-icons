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
import androidx.compose.ui.unit.dp
import fluent.ui.system.icons.FluentUi
import org.jetbrains.compose.ui.tooling.preview.Preview

public val FluentUi.Regular.CubeTree: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.CubeTree",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(9.788f, 5.513f)
            curveTo(9.919f, 5.12f, 10.344f, 4.907f, 10.737f, 5.038f)
            lineTo(12f, 5.459f)
            lineTo(13.263f, 5.038f)
            curveTo(13.656f, 4.907f, 14.08f, 5.12f, 14.212f, 5.513f)
            curveTo(14.342f, 5.906f, 14.13f, 6.331f, 13.737f, 6.462f)
            lineTo(12.75f, 6.791f)
            verticalLineTo(7.75f)
            curveTo(12.75f, 8.164f, 12.414f, 8.5f, 12f, 8.5f)
            curveTo(11.586f, 8.5f, 11.25f, 8.164f, 11.25f, 7.75f)
            verticalLineTo(6.791f)
            lineTo(10.263f, 6.462f)
            curveTo(9.87f, 6.331f, 9.658f, 5.906f, 9.788f, 5.513f)
            close()
            moveTo(12.237f, 2.038f)
            curveTo(12.083f, 1.987f, 11.917f, 1.987f, 11.763f, 2.038f)
            lineTo(8.013f, 3.288f)
            curveTo(7.707f, 3.391f, 7.5f, 3.677f, 7.5f, 4f)
            verticalLineTo(9f)
            curveTo(7.5f, 9.323f, 7.707f, 9.609f, 8.013f, 9.712f)
            lineTo(11.25f, 10.791f)
            verticalLineTo(13f)
            horizontalLineTo(9.5f)
            curveTo(8.257f, 13f, 7.25f, 14.007f, 7.25f, 15.25f)
            verticalLineTo(16.094f)
            curveTo(5.956f, 16.427f, 5f, 17.602f, 5f, 19f)
            curveTo(5f, 20.657f, 6.343f, 22f, 8f, 22f)
            curveTo(9.657f, 22f, 11f, 20.657f, 11f, 19f)
            curveTo(11f, 17.602f, 10.044f, 16.427f, 8.75f, 16.094f)
            verticalLineTo(15.25f)
            curveTo(8.75f, 14.836f, 9.086f, 14.5f, 9.5f, 14.5f)
            horizontalLineTo(14.5f)
            curveTo(14.914f, 14.5f, 15.25f, 14.836f, 15.25f, 15.25f)
            verticalLineTo(16.094f)
            curveTo(13.956f, 16.427f, 13f, 17.602f, 13f, 19f)
            curveTo(13f, 20.657f, 14.343f, 22f, 16f, 22f)
            curveTo(17.657f, 22f, 19f, 20.657f, 19f, 19f)
            curveTo(19f, 17.602f, 18.044f, 16.427f, 16.75f, 16.094f)
            verticalLineTo(15.25f)
            curveTo(16.75f, 14.007f, 15.743f, 13f, 14.5f, 13f)
            horizontalLineTo(12.75f)
            verticalLineTo(10.791f)
            lineTo(15.987f, 9.712f)
            curveTo(16.293f, 9.609f, 16.5f, 9.323f, 16.5f, 9f)
            verticalLineTo(4f)
            curveTo(16.5f, 3.677f, 16.293f, 3.391f, 15.987f, 3.288f)
            lineTo(12.237f, 2.038f)
            close()
            moveTo(9f, 8.459f)
            verticalLineTo(4.541f)
            lineTo(12f, 3.541f)
            lineTo(15f, 4.541f)
            verticalLineTo(8.459f)
            lineTo(12f, 9.459f)
            lineTo(9f, 8.459f)
            close()
            moveTo(8f, 17.5f)
            curveTo(8.828f, 17.5f, 9.5f, 18.172f, 9.5f, 19f)
            curveTo(9.5f, 19.828f, 8.828f, 20.5f, 8f, 20.5f)
            curveTo(7.172f, 20.5f, 6.5f, 19.828f, 6.5f, 19f)
            curveTo(6.5f, 18.172f, 7.172f, 17.5f, 8f, 17.5f)
            close()
            moveTo(14.5f, 19f)
            curveTo(14.5f, 18.172f, 15.172f, 17.5f, 16f, 17.5f)
            curveTo(16.828f, 17.5f, 17.5f, 18.172f, 17.5f, 19f)
            curveTo(17.5f, 19.828f, 16.828f, 20.5f, 16f, 20.5f)
            curveTo(15.172f, 20.5f, 14.5f, 19.828f, 14.5f, 19f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun CubeTreePreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Regular.CubeTree, contentDescription = null)
    }
}
