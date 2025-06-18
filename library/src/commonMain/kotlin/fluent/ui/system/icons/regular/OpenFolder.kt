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

public val FluentUi.Regular.OpenFolder: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.OpenFolder",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f,
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
            moveTo(9.75f, 9f)
            horizontalLineTo(16.254f)
            curveTo(16.669f, 9f, 17.004f, 9.335f, 17.004f, 9.75f)
            curveTo(17.004f, 10.129f, 16.722f, 10.443f, 16.356f, 10.493f)
            lineTo(16.254f, 10.5f)
            lineTo(11.56f, 10.499f)
            lineTo(18.784f, 17.72f)
            curveTo(19.05f, 17.986f, 19.074f, 18.402f, 18.857f, 18.696f)
            lineTo(18.784f, 18.78f)
            curveTo(18.518f, 19.047f, 18.101f, 19.071f, 17.807f, 18.853f)
            lineTo(17.723f, 18.781f)
            lineTo(10.5f, 11.56f)
            lineTo(10.5f, 16.251f)
            curveTo(10.5f, 16.631f, 10.218f, 16.945f, 9.852f, 16.994f)
            lineTo(9.75f, 17.001f)
            curveTo(9.371f, 17.001f, 9.057f, 16.719f, 9.007f, 16.353f)
            lineTo(9f, 16.251f)
            lineTo(9.001f, 9.734f)
            curveTo(9f, 9.709f, 9.002f, 9.684f, 9.005f, 9.658f)
            lineTo(9.026f, 9.55f)
            lineTo(9.061f, 9.454f)
            lineTo(9.066f, 9.442f)
            curveTo(9.101f, 9.361f, 9.153f, 9.286f, 9.219f, 9.219f)
            lineTo(9.263f, 9.179f)
            lineTo(9.344f, 9.118f)
            lineTo(9.404f, 9.084f)
            lineTo(9.499f, 9.042f)
            lineTo(9.566f, 9.023f)
            lineTo(9.628f, 9.009f)
            lineTo(9.721f, 9f)
            lineTo(16.254f, 9f)
            horizontalLineTo(9.75f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun OpenFolderPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Regular.OpenFolder, contentDescription = null)
    }
}
