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

public val FluentUi.Regular.ArrowAutofitContent: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.ArrowAutofitContent",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(5.994f, 4.186f)
            curveTo(6.306f, 4.458f, 6.337f, 4.932f, 6.064f, 5.244f)
            lineTo(5.403f, 6f)
            horizontalLineTo(8.265f)
            curveTo(8.679f, 6f, 9.015f, 6.336f, 9.015f, 6.75f)
            curveTo(9.015f, 7.164f, 8.679f, 7.5f, 8.265f, 7.5f)
            horizontalLineTo(5.403f)
            lineTo(6.064f, 8.256f)
            curveTo(6.337f, 8.568f, 6.306f, 9.042f, 5.994f, 9.314f)
            curveTo(5.682f, 9.587f, 5.208f, 9.556f, 4.936f, 9.244f)
            lineTo(3.186f, 7.244f)
            curveTo(2.938f, 6.961f, 2.938f, 6.539f, 3.186f, 6.256f)
            lineTo(4.936f, 4.256f)
            curveTo(5.208f, 3.944f, 5.682f, 3.913f, 5.994f, 4.186f)
            close()
            moveTo(17.95f, 5.244f)
            curveTo(17.677f, 4.932f, 17.709f, 4.458f, 18.021f, 4.186f)
            curveTo(18.333f, 3.913f, 18.806f, 3.944f, 19.079f, 4.256f)
            lineTo(20.829f, 6.256f)
            curveTo(21.076f, 6.539f, 21.076f, 6.961f, 20.829f, 7.244f)
            lineTo(19.079f, 9.244f)
            curveTo(18.806f, 9.556f, 18.333f, 9.587f, 18.021f, 9.314f)
            curveTo(17.709f, 9.042f, 17.677f, 8.568f, 17.95f, 8.256f)
            lineTo(18.612f, 7.5f)
            horizontalLineTo(15.75f)
            curveTo(15.336f, 7.5f, 15f, 7.164f, 15f, 6.75f)
            curveTo(15f, 6.336f, 15.336f, 6f, 15.75f, 6f)
            horizontalLineTo(18.612f)
            lineTo(17.95f, 5.244f)
            close()
            moveTo(6f, 15.75f)
            curveTo(6f, 15.336f, 6.336f, 15f, 6.75f, 15f)
            horizontalLineTo(17.25f)
            curveTo(17.664f, 15f, 18f, 15.336f, 18f, 15.75f)
            curveTo(18f, 16.164f, 17.664f, 16.5f, 17.25f, 16.5f)
            horizontalLineTo(6.75f)
            curveTo(6.336f, 16.5f, 6f, 16.164f, 6f, 15.75f)
            close()
            moveTo(5.75f, 11f)
            curveTo(4.231f, 11f, 3f, 12.231f, 3f, 13.75f)
            verticalLineTo(17.75f)
            curveTo(3f, 19.269f, 4.231f, 20.5f, 5.75f, 20.5f)
            horizontalLineTo(18.25f)
            curveTo(19.769f, 20.5f, 21f, 19.269f, 21f, 17.75f)
            verticalLineTo(13.75f)
            curveTo(21f, 12.231f, 19.769f, 11f, 18.25f, 11f)
            horizontalLineTo(5.75f)
            close()
            moveTo(4.5f, 13.75f)
            curveTo(4.5f, 13.06f, 5.06f, 12.5f, 5.75f, 12.5f)
            horizontalLineTo(18.25f)
            curveTo(18.94f, 12.5f, 19.5f, 13.06f, 19.5f, 13.75f)
            verticalLineTo(17.75f)
            curveTo(19.5f, 18.44f, 18.94f, 19f, 18.25f, 19f)
            horizontalLineTo(5.75f)
            curveTo(5.06f, 19f, 4.5f, 18.44f, 4.5f, 17.75f)
            verticalLineTo(13.75f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun ArrowAutofitContentPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Regular.ArrowAutofitContent, contentDescription = null)
    }
}
