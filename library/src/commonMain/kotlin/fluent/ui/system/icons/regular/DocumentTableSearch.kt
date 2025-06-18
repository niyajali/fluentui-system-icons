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

public val FluentUi.Regular.DocumentTableSearch: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.DocumentTableSearch",
        defaultWidth = 24.dp,
        defaultHeight = 25.dp,
        viewportWidth = 24f,
        viewportHeight = 25f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(15.25f, 12f)
            curveTo(16.216f, 12f, 17f, 12.783f, 17f, 13.75f)
            verticalLineTo(17.75f)
            curveTo(17f, 18.716f, 16.216f, 19.5f, 15.25f, 19.5f)
            horizontalLineTo(10.475f)
            lineTo(10.425f, 19.45f)
            curveTo(10.793f, 18.713f, 11f, 17.881f, 11f, 17f)
            curveTo(11f, 15.823f, 10.63f, 14.732f, 10f, 13.837f)
            verticalLineTo(13.5f)
            horizontalLineTo(9.743f)
            curveTo(9.283f, 12.943f, 8.715f, 12.478f, 8.071f, 12.137f)
            curveTo(8.28f, 12.049f, 8.509f, 12f, 8.75f, 12f)
            horizontalLineTo(15.25f)
            close()
            moveTo(11.5f, 16.5f)
            verticalLineTo(18f)
            horizontalLineTo(15.25f)
            curveTo(15.388f, 18f, 15.5f, 17.888f, 15.5f, 17.75f)
            verticalLineTo(16.5f)
            horizontalLineTo(11.5f)
            close()
            moveTo(15.5f, 15f)
            verticalLineTo(13.75f)
            curveTo(15.5f, 13.612f, 15.388f, 13.5f, 15.25f, 13.5f)
            horizontalLineTo(11.5f)
            verticalLineTo(15f)
            horizontalLineTo(15.5f)
            close()
            moveTo(18f, 21f)
            horizontalLineTo(11.975f)
            lineTo(12.487f, 21.513f)
            curveTo(12.765f, 21.791f, 12.93f, 22.139f, 12.982f, 22.5f)
            horizontalLineTo(18f)
            curveTo(19.104f, 22.5f, 20f, 21.604f, 20f, 20.5f)
            verticalLineTo(10.328f)
            curveTo(20f, 9.798f, 19.789f, 9.289f, 19.414f, 8.914f)
            lineTo(13.585f, 3.086f)
            curveTo(13.57f, 3.071f, 13.553f, 3.058f, 13.536f, 3.045f)
            curveTo(13.524f, 3.036f, 13.512f, 3.026f, 13.5f, 3.016f)
            curveTo(13.429f, 2.952f, 13.359f, 2.889f, 13.281f, 2.836f)
            curveTo(13.256f, 2.819f, 13.228f, 2.805f, 13.2f, 2.792f)
            curveTo(13.184f, 2.784f, 13.168f, 2.776f, 13.153f, 2.768f)
            curveTo(13.136f, 2.759f, 13.12f, 2.749f, 13.103f, 2.739f)
            curveTo(13.049f, 2.708f, 12.994f, 2.676f, 12.937f, 2.652f)
            curveTo(12.74f, 2.57f, 12.528f, 2.529f, 12.313f, 2.514f)
            curveTo(12.293f, 2.513f, 12.274f, 2.51f, 12.254f, 2.507f)
            curveTo(12.227f, 2.504f, 12.2f, 2.5f, 12.172f, 2.5f)
            horizontalLineTo(6f)
            curveTo(4.896f, 2.5f, 4f, 3.396f, 4f, 4.5f)
            verticalLineTo(11.707f)
            curveTo(4.477f, 11.572f, 4.98f, 11.5f, 5.5f, 11.5f)
            verticalLineTo(4.5f)
            curveTo(5.5f, 4.225f, 5.724f, 4f, 6f, 4f)
            horizontalLineTo(12f)
            verticalLineTo(8.5f)
            curveTo(12f, 9.604f, 12.896f, 10.5f, 14f, 10.5f)
            horizontalLineTo(18.5f)
            verticalLineTo(20.5f)
            curveTo(18.5f, 20.775f, 18.276f, 21f, 18f, 21f)
            close()
            moveTo(17.378f, 9f)
            horizontalLineTo(14f)
            curveTo(13.724f, 9f, 13.5f, 8.775f, 13.5f, 8.5f)
            verticalLineTo(5.121f)
            lineTo(17.378f, 9f)
            close()
            moveTo(5.5f, 21.5f)
            curveTo(6.472f, 21.5f, 7.372f, 21.192f, 8.107f, 20.668f)
            lineTo(10.72f, 23.28f)
            curveTo(11.013f, 23.573f, 11.487f, 23.573f, 11.78f, 23.28f)
            curveTo(12.073f, 22.987f, 12.073f, 22.513f, 11.78f, 22.22f)
            lineTo(9.168f, 19.607f)
            curveTo(9.692f, 18.872f, 10f, 17.972f, 10f, 17f)
            curveTo(10f, 14.515f, 7.985f, 12.5f, 5.5f, 12.5f)
            curveTo(3.015f, 12.5f, 1f, 14.515f, 1f, 17f)
            curveTo(1f, 19.485f, 3.015f, 21.5f, 5.5f, 21.5f)
            close()
            moveTo(5.5f, 20f)
            curveTo(3.843f, 20f, 2.5f, 18.657f, 2.5f, 17f)
            curveTo(2.5f, 15.343f, 3.843f, 14f, 5.5f, 14f)
            curveTo(7.157f, 14f, 8.5f, 15.343f, 8.5f, 17f)
            curveTo(8.5f, 18.657f, 7.157f, 20f, 5.5f, 20f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun DocumentTableSearchPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Regular.DocumentTableSearch, contentDescription = null)
    }
}
