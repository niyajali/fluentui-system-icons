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

public val FluentIcons.Regular.ArrowTrendingLines: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.ArrowTrendingLines",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(16.749f, 2f)
            lineTo(21.303f, 2.001f)
            lineTo(21.403f, 2.014f)
            lineTo(21.502f, 2.042f)
            lineTo(21.562f, 2.068f)
            curveTo(21.641f, 2.102f, 21.715f, 2.153f, 21.781f, 2.218f)
            lineTo(21.822f, 2.262f)
            lineTo(21.865f, 2.319f)
            lineTo(21.919f, 2.409f)
            lineTo(21.958f, 2.499f)
            lineTo(21.977f, 2.563f)
            lineTo(21.991f, 2.627f)
            lineTo(22f, 2.721f)
            lineTo(22f, 7.254f)
            curveTo(22f, 7.668f, 21.665f, 8.004f, 21.25f, 8.004f)
            curveTo(20.871f, 8.004f, 20.557f, 7.722f, 20.507f, 7.356f)
            lineTo(20.5f, 7.254f)
            lineTo(20.5f, 4.559f)
            lineTo(14.061f, 11f)
            curveTo(13.794f, 11.266f, 13.378f, 11.29f, 13.084f, 11.072f)
            lineTo(13f, 11f)
            lineTo(9.97f, 8.089f)
            lineTo(4.28f, 13.779f)
            curveTo(3.987f, 14.071f, 3.513f, 14.071f, 3.22f, 13.779f)
            curveTo(2.953f, 13.512f, 2.929f, 13.096f, 3.147f, 12.802f)
            lineTo(3.22f, 12.718f)
            lineTo(9.439f, 6.498f)
            curveTo(9.706f, 6.232f, 10.122f, 6.208f, 10.416f, 6.426f)
            lineTo(10.5f, 6.498f)
            lineTo(13.53f, 9.409f)
            lineTo(19.438f, 3.5f)
            horizontalLineTo(16.749f)
            curveTo(16.369f, 3.5f, 16.055f, 3.218f, 16.006f, 2.852f)
            lineTo(15.999f, 2.75f)
            curveTo(15.999f, 2.37f, 16.281f, 2.057f, 16.647f, 2.007f)
            lineTo(16.749f, 2f)
            close()
            moveTo(3.75f, 17f)
            curveTo(4.164f, 17f, 4.5f, 17.336f, 4.5f, 17.75f)
            verticalLineTo(21.25f)
            curveTo(4.5f, 21.664f, 4.164f, 22f, 3.75f, 22f)
            curveTo(3.336f, 22f, 3f, 21.664f, 3f, 21.25f)
            verticalLineTo(17.75f)
            curveTo(3f, 17.336f, 3.336f, 17f, 3.75f, 17f)
            close()
            moveTo(9.5f, 13.75f)
            curveTo(9.5f, 13.336f, 9.164f, 13f, 8.75f, 13f)
            curveTo(8.336f, 13f, 8f, 13.336f, 8f, 13.75f)
            verticalLineTo(21.25f)
            curveTo(8f, 21.664f, 8.336f, 22f, 8.75f, 22f)
            curveTo(9.164f, 22f, 9.5f, 21.664f, 9.5f, 21.25f)
            verticalLineTo(13.75f)
            close()
            moveTo(13.75f, 15f)
            curveTo(14.164f, 15f, 14.5f, 15.336f, 14.5f, 15.75f)
            verticalLineTo(21.25f)
            curveTo(14.5f, 21.664f, 14.164f, 22f, 13.75f, 22f)
            curveTo(13.336f, 22f, 13f, 21.664f, 13f, 21.25f)
            verticalLineTo(15.75f)
            curveTo(13f, 15.336f, 13.336f, 15f, 13.75f, 15f)
            close()
            moveTo(19.5f, 10.75f)
            curveTo(19.5f, 10.336f, 19.164f, 10f, 18.75f, 10f)
            curveTo(18.336f, 10f, 18f, 10.336f, 18f, 10.75f)
            verticalLineTo(21.25f)
            curveTo(18f, 21.664f, 18.336f, 22f, 18.75f, 22f)
            curveTo(19.164f, 22f, 19.5f, 21.664f, 19.5f, 21.25f)
            verticalLineTo(10.75f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun ArrowTrendingLinesPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.ArrowTrendingLines, contentDescription = null)
    }
}
