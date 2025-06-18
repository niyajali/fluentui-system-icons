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

public val FluentUi.Filled.PeopleCall: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.PeopleCall",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(8f, 11f)
            curveTo(10.209f, 11f, 12f, 9.209f, 12f, 7f)
            curveTo(12f, 4.791f, 10.209f, 3f, 8f, 3f)
            curveTo(5.791f, 3f, 4f, 4.791f, 4f, 7f)
            curveTo(4f, 9.209f, 5.791f, 11f, 8f, 11f)
            close()
            moveTo(17f, 11f)
            curveTo(18.657f, 11f, 20f, 9.657f, 20f, 8f)
            curveTo(20f, 6.343f, 18.657f, 5f, 17f, 5f)
            curveTo(15.343f, 5f, 14f, 6.343f, 14f, 8f)
            curveTo(14f, 9.657f, 15.343f, 11f, 17f, 11f)
            close()
            moveTo(4.25f, 13f)
            curveTo(3.007f, 13f, 2f, 14.007f, 2f, 15.25f)
            verticalLineTo(15.5f)
            curveTo(2f, 15.5f, 2f, 20f, 8f, 20f)
            curveTo(14f, 20f, 14f, 15.5f, 14f, 15.5f)
            verticalLineTo(15.25f)
            curveTo(14f, 14.007f, 12.993f, 13f, 11.75f, 13f)
            horizontalLineTo(4.25f)
            close()
            moveTo(18.192f, 13.995f)
            lineTo(18.668f, 12.79f)
            curveTo(18.91f, 12.176f, 19.589f, 11.857f, 20.216f, 12.062f)
            lineTo(20.647f, 12.203f)
            curveTo(21.371f, 12.44f, 21.973f, 13.009f, 21.997f, 13.772f)
            curveTo(22.096f, 16.883f, 19.521f, 21.354f, 16.784f, 22.827f)
            curveTo(16.111f, 23.189f, 15.316f, 22.95f, 14.748f, 22.436f)
            lineTo(14.412f, 22.131f)
            curveTo(13.923f, 21.688f, 13.861f, 20.942f, 14.27f, 20.425f)
            lineTo(15.07f, 19.415f)
            curveTo(15.36f, 19.048f, 15.837f, 18.884f, 16.291f, 18.995f)
            lineTo(17.582f, 19.308f)
            curveTo(18.685f, 18.578f, 19.277f, 17.552f, 19.356f, 16.229f)
            lineTo(18.44f, 15.265f)
            curveTo(18.117f, 14.926f, 18.021f, 14.43f, 18.192f, 13.995f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun PeopleCallPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Filled.PeopleCall, contentDescription = null)
    }
}
