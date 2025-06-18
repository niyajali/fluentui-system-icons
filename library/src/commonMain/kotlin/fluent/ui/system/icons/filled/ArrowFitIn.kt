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

public val FluentUi.Filled.ArrowFitIn: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.ArrowFitIn",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(5.818f, 7.519f)
            curveTo(5.414f, 7.896f, 5.392f, 8.529f, 5.769f, 8.932f)
            lineTo(7.699f, 11f)
            horizontalLineTo(3f)
            curveTo(2.448f, 11f, 2f, 11.448f, 2f, 12f)
            curveTo(2f, 12.552f, 2.448f, 13f, 3f, 13f)
            horizontalLineTo(7.699f)
            lineTo(5.769f, 15.068f)
            curveTo(5.392f, 15.471f, 5.414f, 16.104f, 5.818f, 16.481f)
            curveTo(6.221f, 16.858f, 6.854f, 16.836f, 7.231f, 16.432f)
            lineTo(10.729f, 12.685f)
            curveTo(10.747f, 12.665f, 10.764f, 12.645f, 10.781f, 12.625f)
            curveTo(10.818f, 12.579f, 10.85f, 12.53f, 10.877f, 12.48f)
            curveTo(10.956f, 12.337f, 11f, 12.174f, 11f, 12f)
            curveTo(11f, 11.755f, 10.912f, 11.531f, 10.766f, 11.357f)
            curveTo(10.754f, 11.343f, 10.742f, 11.33f, 10.73f, 11.317f)
            lineTo(7.231f, 7.568f)
            curveTo(6.854f, 7.164f, 6.221f, 7.142f, 5.818f, 7.519f)
            close()
            moveTo(18.182f, 7.519f)
            curveTo(18.586f, 7.896f, 18.608f, 8.529f, 18.231f, 8.932f)
            lineTo(16.301f, 11f)
            horizontalLineTo(21f)
            curveTo(21.552f, 11f, 22f, 11.448f, 22f, 12f)
            curveTo(22f, 12.552f, 21.552f, 13f, 21f, 13f)
            horizontalLineTo(16.301f)
            lineTo(18.231f, 15.068f)
            curveTo(18.608f, 15.471f, 18.586f, 16.104f, 18.182f, 16.481f)
            curveTo(17.779f, 16.858f, 17.146f, 16.836f, 16.769f, 16.432f)
            lineTo(13.271f, 12.685f)
            curveTo(13.254f, 12.666f, 13.237f, 12.647f, 13.221f, 12.627f)
            curveTo(13.184f, 12.581f, 13.151f, 12.531f, 13.123f, 12.48f)
            curveTo(13.044f, 12.337f, 13f, 12.174f, 13f, 12f)
            curveTo(13f, 11.757f, 13.087f, 11.535f, 13.23f, 11.361f)
            curveTo(13.243f, 11.346f, 13.256f, 11.331f, 13.27f, 11.316f)
            lineTo(16.769f, 7.568f)
            curveTo(17.146f, 7.164f, 17.779f, 7.142f, 18.182f, 7.519f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun ArrowFitInPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Filled.ArrowFitIn, contentDescription = null)
    }
}
