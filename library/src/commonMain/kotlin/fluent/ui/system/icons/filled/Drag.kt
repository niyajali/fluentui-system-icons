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

public val FluentUi.Filled.Drag: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.Drag",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(12f, 16f)
            curveTo(12.513f, 16f, 12.935f, 16.386f, 12.993f, 16.884f)
            lineTo(13f, 17f)
            verticalLineTo(18.584f)
            lineTo(13.293f, 18.293f)
            curveTo(13.653f, 17.933f, 14.22f, 17.905f, 14.613f, 18.21f)
            lineTo(14.707f, 18.293f)
            curveTo(15.067f, 18.654f, 15.095f, 19.221f, 14.79f, 19.613f)
            lineTo(14.707f, 19.708f)
            lineTo(12.707f, 21.708f)
            lineTo(12.663f, 21.749f)
            lineTo(12.595f, 21.804f)
            lineTo(12.484f, 21.876f)
            lineTo(12.371f, 21.929f)
            lineTo(12.266f, 21.965f)
            lineTo(12.148f, 21.99f)
            lineTo(12.059f, 21.999f)
            horizontalLineTo(11.94f)
            lineTo(11.882f, 21.994f)
            lineTo(11.766f, 21.973f)
            lineTo(11.658f, 21.941f)
            lineTo(11.577f, 21.907f)
            lineTo(11.479f, 21.854f)
            lineTo(11.383f, 21.788f)
            curveTo(11.351f, 21.763f, 11.321f, 21.736f, 11.293f, 21.708f)
            lineTo(9.293f, 19.708f)
            curveTo(8.902f, 19.317f, 8.902f, 18.684f, 9.293f, 18.293f)
            curveTo(9.653f, 17.933f, 10.22f, 17.905f, 10.613f, 18.21f)
            lineTo(10.707f, 18.293f)
            lineTo(11f, 18.586f)
            verticalLineTo(17f)
            curveTo(11f, 16.488f, 11.386f, 16.065f, 11.883f, 16.007f)
            lineTo(12f, 16f)
            close()
            moveTo(18.293f, 9.293f)
            curveTo(18.653f, 8.933f, 19.22f, 8.905f, 19.613f, 9.21f)
            lineTo(19.707f, 9.293f)
            lineTo(21.707f, 11.293f)
            lineTo(21.748f, 11.337f)
            lineTo(21.803f, 11.405f)
            lineTo(21.875f, 11.516f)
            lineTo(21.929f, 11.629f)
            lineTo(21.964f, 11.734f)
            lineTo(21.989f, 11.852f)
            lineTo(21.998f, 11.941f)
            verticalLineTo(12.06f)
            lineTo(21.993f, 12.118f)
            lineTo(21.972f, 12.234f)
            lineTo(21.94f, 12.342f)
            lineTo(21.906f, 12.424f)
            lineTo(21.854f, 12.521f)
            lineTo(21.78f, 12.626f)
            lineTo(21.707f, 12.708f)
            lineTo(19.707f, 14.708f)
            curveTo(19.316f, 15.098f, 18.683f, 15.098f, 18.293f, 14.708f)
            curveTo(17.932f, 14.347f, 17.904f, 13.78f, 18.209f, 13.388f)
            lineTo(18.293f, 13.293f)
            lineTo(18.584f, 13f)
            horizontalLineTo(17f)
            curveTo(16.487f, 13f, 16.064f, 12.614f, 16.007f, 12.117f)
            lineTo(16f, 12f)
            curveTo(16f, 11.488f, 16.386f, 11.065f, 16.883f, 11.007f)
            lineTo(17f, 11f)
            horizontalLineTo(18.585f)
            lineTo(18.293f, 10.708f)
            curveTo(17.932f, 10.347f, 17.904f, 9.78f, 18.209f, 9.388f)
            lineTo(18.293f, 9.293f)
            close()
            moveTo(4.293f, 9.293f)
            curveTo(4.683f, 8.903f, 5.316f, 8.903f, 5.707f, 9.293f)
            curveTo(6.067f, 9.654f, 6.095f, 10.221f, 5.79f, 10.613f)
            lineTo(5.707f, 10.708f)
            lineTo(5.414f, 11f)
            horizontalLineTo(7f)
            curveTo(7.513f, 11f, 7.935f, 11.387f, 7.993f, 11.884f)
            lineTo(8f, 12f)
            curveTo(8f, 12.513f, 7.614f, 12.936f, 7.116f, 12.994f)
            lineTo(7f, 13f)
            horizontalLineTo(5.415f)
            lineTo(5.707f, 13.293f)
            curveTo(6.067f, 13.654f, 6.095f, 14.221f, 5.79f, 14.613f)
            lineTo(5.707f, 14.708f)
            curveTo(5.346f, 15.068f, 4.779f, 15.096f, 4.387f, 14.791f)
            lineTo(4.293f, 14.708f)
            lineTo(2.293f, 12.708f)
            lineTo(2.196f, 12.596f)
            lineTo(2.124f, 12.484f)
            lineTo(2.071f, 12.372f)
            lineTo(2.036f, 12.267f)
            lineTo(2.011f, 12.149f)
            lineTo(2.003f, 12.086f)
            lineTo(2f, 11.981f)
            lineTo(2.004f, 11.911f)
            lineTo(2.02f, 11.8f)
            lineTo(2.05f, 11.688f)
            lineTo(2.093f, 11.577f)
            lineTo(2.146f, 11.48f)
            lineTo(2.213f, 11.384f)
            curveTo(2.237f, 11.352f, 2.264f, 11.322f, 2.293f, 11.293f)
            lineTo(4.293f, 9.293f)
            close()
            moveTo(12f, 9.25f)
            curveTo(13.519f, 9.25f, 14.75f, 10.482f, 14.75f, 12f)
            curveTo(14.75f, 13.519f, 13.519f, 14.75f, 12f, 14.75f)
            curveTo(10.481f, 14.75f, 9.25f, 13.519f, 9.25f, 12f)
            curveTo(9.25f, 10.482f, 10.481f, 9.25f, 12f, 9.25f)
            close()
            moveTo(11.851f, 2.011f)
            lineTo(11.925f, 2.003f)
            lineTo(12.054f, 2.002f)
            lineTo(12.175f, 2.016f)
            lineTo(12.312f, 2.05f)
            lineTo(12.423f, 2.094f)
            lineTo(12.521f, 2.146f)
            lineTo(12.625f, 2.22f)
            lineTo(12.707f, 2.293f)
            lineTo(14.707f, 4.293f)
            curveTo(15.097f, 4.684f, 15.097f, 5.317f, 14.707f, 5.708f)
            curveTo(14.346f, 6.068f, 13.779f, 6.096f, 13.387f, 5.791f)
            lineTo(13.293f, 5.708f)
            lineTo(13f, 5.415f)
            verticalLineTo(7f)
            curveTo(13f, 7.513f, 12.614f, 7.936f, 12.116f, 7.994f)
            lineTo(12f, 8f)
            curveTo(11.487f, 8f, 11.064f, 7.614f, 11.007f, 7.117f)
            lineTo(11f, 7f)
            verticalLineTo(5.414f)
            lineTo(10.707f, 5.708f)
            curveTo(10.346f, 6.068f, 9.779f, 6.096f, 9.387f, 5.791f)
            lineTo(9.293f, 5.708f)
            curveTo(8.932f, 5.347f, 8.905f, 4.78f, 9.21f, 4.388f)
            lineTo(9.293f, 4.293f)
            lineTo(11.293f, 2.293f)
            lineTo(11.405f, 2.197f)
            lineTo(11.516f, 2.125f)
            lineTo(11.628f, 2.072f)
            lineTo(11.734f, 2.036f)
            lineTo(11.851f, 2.011f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun DragPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Filled.Drag, contentDescription = null)
    }
}
