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
import fluent.ui.system.icons.FluentIcons
import org.jetbrains.compose.ui.tooling.preview.Preview

public val FluentIcons.Regular.PulseSquare: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.PulseSquare",
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
            moveTo(18.749f, 4.5f)
            horizontalLineTo(5.25f)
            curveTo(4.836f, 4.5f, 4.5f, 4.836f, 4.5f, 5.25f)
            verticalLineTo(18.752f)
            curveTo(4.5f, 19.167f, 4.836f, 19.502f, 5.25f, 19.502f)
            horizontalLineTo(18.749f)
            curveTo(19.163f, 19.502f, 19.499f, 19.167f, 19.499f, 18.752f)
            verticalLineTo(5.25f)
            curveTo(19.499f, 4.836f, 19.163f, 4.5f, 18.749f, 4.5f)
            close()
            moveTo(8.255f, 11.5f)
            lineTo(9.812f, 7.949f)
            curveTo(10.063f, 7.376f, 10.847f, 7.355f, 11.145f, 7.869f)
            lineTo(11.195f, 7.972f)
            lineTo(13.576f, 13.918f)
            lineTo(14.579f, 11.915f)
            curveTo(14.691f, 11.693f, 14.903f, 11.542f, 15.145f, 11.508f)
            lineTo(15.25f, 11.5f)
            horizontalLineTo(17.25f)
            curveTo(17.664f, 11.5f, 18f, 11.836f, 18f, 12.25f)
            curveTo(18f, 12.63f, 17.718f, 12.944f, 17.352f, 12.994f)
            lineTo(17.25f, 13f)
            horizontalLineTo(15.713f)
            lineTo(14.171f, 16.081f)
            curveTo(13.898f, 16.626f, 13.141f, 16.627f, 12.852f, 16.125f)
            lineTo(12.804f, 16.024f)
            lineTo(10.467f, 10.19f)
            lineTo(9.432f, 12.552f)
            curveTo(9.328f, 12.79f, 9.108f, 12.955f, 8.855f, 12.992f)
            lineTo(8.745f, 13f)
            horizontalLineTo(6.75f)
            curveTo(6.336f, 13f, 6f, 12.665f, 6f, 12.25f)
            curveTo(6f, 11.871f, 6.282f, 11.557f, 6.648f, 11.507f)
            lineTo(6.75f, 11.5f)
            horizontalLineTo(8.255f)
            lineTo(9.812f, 7.949f)
            lineTo(8.255f, 11.5f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun PulseSquarePreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.PulseSquare, contentDescription = null)
    }
}
