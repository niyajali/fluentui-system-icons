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

public val FluentIcons.Filled.PulseSquare: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.PulseSquare",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(18.749f, 3f)
            curveTo(19.992f, 3f, 20.999f, 4.007f, 20.999f, 5.25f)
            verticalLineTo(18.752f)
            curveTo(20.999f, 19.995f, 19.992f, 21.002f, 18.749f, 21.002f)
            horizontalLineTo(5.25f)
            curveTo(4.007f, 21.002f, 3f, 19.995f, 3f, 18.752f)
            verticalLineTo(5.25f)
            curveTo(3f, 4.007f, 4.007f, 3f, 5.25f, 3f)
            horizontalLineTo(18.749f)
            close()
            moveTo(9.812f, 7.949f)
            lineTo(8.255f, 11.5f)
            horizontalLineTo(6.75f)
            curveTo(6.336f, 11.5f, 6f, 11.836f, 6f, 12.25f)
            curveTo(6f, 12.665f, 6.336f, 13f, 6.75f, 13f)
            horizontalLineTo(8.745f)
            curveTo(9.043f, 13f, 9.313f, 12.824f, 9.432f, 12.552f)
            lineTo(10.467f, 10.19f)
            lineTo(12.804f, 16.024f)
            curveTo(13.044f, 16.625f, 13.881f, 16.66f, 14.171f, 16.081f)
            lineTo(15.713f, 13f)
            horizontalLineTo(17.25f)
            curveTo(17.664f, 13f, 18f, 12.665f, 18f, 12.25f)
            curveTo(18f, 11.836f, 17.664f, 11.5f, 17.25f, 11.5f)
            horizontalLineTo(15.25f)
            curveTo(14.966f, 11.5f, 14.707f, 11.661f, 14.579f, 11.915f)
            lineTo(13.576f, 13.918f)
            lineTo(11.195f, 7.972f)
            curveTo(10.948f, 7.354f, 10.079f, 7.34f, 9.812f, 7.949f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun PulseSquarePreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.PulseSquare, contentDescription = null)
    }
}
