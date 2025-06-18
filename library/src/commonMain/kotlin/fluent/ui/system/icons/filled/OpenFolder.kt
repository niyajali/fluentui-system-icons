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
package fluent.ui.system.icons.filled

import org.jetbrains.compose.ui.tooling.preview.Preview
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

public val FluentUi.Filled.OpenFolder: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.OpenFolder",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(6.747f, 3f)
            lineTo(17.253f, 3.002f)
            curveTo(19.257f, 3.003f, 20.894f, 4.575f, 20.998f, 6.553f)
            lineTo(21.003f, 6.752f)
            verticalLineTo(11.245f)
            curveTo(21.003f, 11.659f, 20.667f, 11.995f, 20.253f, 11.995f)
            curveTo(19.874f, 11.995f, 19.56f, 11.713f, 19.51f, 11.347f)
            lineTo(19.503f, 11.245f)
            verticalLineTo(6.752f)
            curveTo(19.503f, 5.562f, 18.578f, 4.587f, 17.407f, 4.507f)
            lineTo(17.253f, 4.502f)
            lineTo(6.747f, 4.5f)
            curveTo(5.569f, 4.499f, 4.602f, 5.404f, 4.505f, 6.557f)
            lineTo(4.497f, 6.716f)
            lineTo(4.499f, 17.252f)
            curveTo(4.5f, 18.443f, 5.425f, 19.417f, 6.596f, 19.497f)
            lineTo(6.75f, 19.502f)
            horizontalLineTo(11.246f)
            curveTo(11.66f, 19.502f, 11.996f, 19.838f, 11.996f, 20.252f)
            curveTo(11.996f, 20.632f, 11.714f, 20.946f, 11.348f, 20.995f)
            lineTo(11.246f, 21.002f)
            horizontalLineTo(6.75f)
            curveTo(4.746f, 21.001f, 3.109f, 19.43f, 3.005f, 17.451f)
            lineTo(2.999f, 17.252f)
            lineTo(2.998f, 6.753f)
            lineTo(3.002f, 6.549f)
            curveTo(3.102f, 4.636f, 4.636f, 3.104f, 6.548f, 3.005f)
            lineTo(6.747f, 3f)
            close()
            moveTo(9.941f, 9.002f)
            lineTo(15.996f, 9.001f)
            curveTo(16.549f, 9.001f, 16.996f, 9.449f, 16.996f, 10.001f)
            curveTo(16.996f, 10.514f, 16.61f, 10.937f, 16.113f, 10.995f)
            lineTo(15.996f, 11.001f)
            lineTo(12.417f, 11.001f)
            lineTo(18.961f, 17.543f)
            curveTo(19.321f, 17.903f, 19.349f, 18.47f, 19.044f, 18.863f)
            lineTo(18.961f, 18.957f)
            curveTo(18.6f, 19.317f, 18.033f, 19.345f, 17.641f, 19.04f)
            lineTo(17.546f, 18.957f)
            lineTo(10.999f, 12.412f)
            lineTo(10.999f, 16.002f)
            curveTo(10.999f, 16.515f, 10.613f, 16.938f, 10.115f, 16.996f)
            lineTo(9.999f, 17.002f)
            curveTo(9.486f, 17.002f, 9.063f, 16.616f, 9.006f, 16.119f)
            lineTo(8.999f, 16.002f)
            verticalLineTo(10.001f)
            lineTo(9.002f, 9.917f)
            lineTo(9.018f, 9.812f)
            lineTo(9.027f, 9.766f)
            lineTo(9.046f, 9.7f)
            lineTo(9.082f, 9.601f)
            lineTo(9.146f, 9.479f)
            curveTo(9.187f, 9.411f, 9.237f, 9.349f, 9.293f, 9.293f)
            lineTo(9.402f, 9.198f)
            lineTo(9.524f, 9.12f)
            lineTo(9.625f, 9.073f)
            lineTo(9.714f, 9.042f)
            lineTo(9.825f, 9.015f)
            lineTo(9.941f, 9.002f)
            lineTo(15.996f, 9.001f)
            lineTo(9.941f, 9.002f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun OpenFolderPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Filled.OpenFolder, contentDescription = null)
    }
}
