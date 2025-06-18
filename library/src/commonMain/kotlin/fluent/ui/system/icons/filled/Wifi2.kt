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

public val FluentIcons.Filled.Wifi2: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.Wifi2",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(10.96f, 16.44f)
            curveTo(11.546f, 15.854f, 12.496f, 15.854f, 13.082f, 16.44f)
            curveTo(13.668f, 17.026f, 13.668f, 17.976f, 13.082f, 18.563f)
            curveTo(12.496f, 19.149f, 11.546f, 19.149f, 10.96f, 18.563f)
            curveTo(10.373f, 17.976f, 10.373f, 17.026f, 10.96f, 16.44f)
            close()
            moveTo(8.356f, 13.698f)
            curveTo(10.399f, 11.655f, 13.713f, 11.655f, 15.756f, 13.698f)
            curveTo(16.217f, 14.159f, 16.594f, 14.723f, 16.857f, 15.323f)
            curveTo(17.079f, 15.829f, 16.849f, 16.419f, 16.343f, 16.64f)
            curveTo(15.837f, 16.862f, 15.247f, 16.632f, 15.025f, 16.126f)
            curveTo(14.86f, 15.748f, 14.622f, 15.393f, 14.342f, 15.113f)
            curveTo(13.079f, 13.85f, 11.033f, 13.85f, 9.77f, 15.113f)
            curveTo(9.492f, 15.391f, 9.265f, 15.731f, 9.098f, 16.113f)
            curveTo(8.877f, 16.619f, 8.287f, 16.85f, 7.781f, 16.628f)
            curveTo(7.275f, 16.407f, 7.044f, 15.817f, 7.266f, 15.311f)
            curveTo(7.53f, 14.708f, 7.896f, 14.158f, 8.356f, 13.698f)
            close()
            moveTo(6.31f, 10.707f)
            curveTo(9.484f, 7.533f, 14.631f, 7.533f, 17.805f, 10.707f)
            curveTo(18.401f, 11.303f, 18.916f, 12.025f, 19.309f, 12.792f)
            curveTo(19.56f, 13.283f, 19.365f, 13.886f, 18.874f, 14.137f)
            curveTo(18.382f, 14.389f, 17.779f, 14.194f, 17.528f, 13.702f)
            curveTo(17.228f, 13.116f, 16.835f, 12.565f, 16.391f, 12.121f)
            curveTo(13.998f, 9.728f, 10.118f, 9.728f, 7.725f, 12.121f)
            curveTo(7.259f, 12.586f, 6.882f, 13.108f, 6.591f, 13.683f)
            curveTo(6.342f, 14.176f, 5.74f, 14.373f, 5.248f, 14.124f)
            curveTo(4.755f, 13.875f, 4.557f, 13.273f, 4.807f, 12.781f)
            curveTo(5.193f, 12.017f, 5.695f, 11.322f, 6.31f, 10.707f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun Wifi2Preview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.Wifi2, contentDescription = null)
    }
}
