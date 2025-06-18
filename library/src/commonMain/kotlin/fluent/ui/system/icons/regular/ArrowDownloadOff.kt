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

public val FluentIcons.Regular.ArrowDownloadOff: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.ArrowDownloadOff",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(3.28f, 2.22f)
            curveTo(2.987f, 1.927f, 2.513f, 1.927f, 2.22f, 2.22f)
            curveTo(1.927f, 2.513f, 1.927f, 2.987f, 2.22f, 3.28f)
            lineTo(10.999f, 12.06f)
            lineTo(10.999f, 16.433f)
            lineTo(7.28f, 12.719f)
            lineTo(7.196f, 12.647f)
            curveTo(6.902f, 12.429f, 6.485f, 12.453f, 6.219f, 12.72f)
            curveTo(5.927f, 13.013f, 5.927f, 13.488f, 6.22f, 13.781f)
            lineTo(11.224f, 18.777f)
            lineTo(11.308f, 18.85f)
            curveTo(11.601f, 19.067f, 12.018f, 19.043f, 12.284f, 18.777f)
            lineTo(15f, 16.061f)
            lineTo(20.719f, 21.781f)
            curveTo(21.012f, 22.073f, 21.487f, 22.073f, 21.78f, 21.781f)
            curveTo(22.073f, 21.488f, 22.073f, 21.013f, 21.78f, 20.72f)
            lineTo(3.28f, 2.22f)
            close()
            moveTo(13.939f, 15f)
            lineTo(12.499f, 16.44f)
            lineTo(12.499f, 13.56f)
            lineTo(13.939f, 15f)
            close()
            moveTo(17.122f, 13.94f)
            lineTo(16.061f, 12.879f)
            lineTo(16.221f, 12.72f)
            curveTo(16.487f, 12.453f, 16.904f, 12.429f, 17.197f, 12.647f)
            lineTo(17.281f, 12.72f)
            curveTo(17.548f, 12.986f, 17.572f, 13.403f, 17.354f, 13.696f)
            lineTo(17.281f, 13.78f)
            lineTo(17.122f, 13.94f)
            close()
            moveTo(11f, 7.818f)
            lineTo(12.5f, 9.318f)
            lineTo(12.5f, 2.755f)
            lineTo(12.493f, 2.653f)
            curveTo(12.443f, 2.287f, 12.13f, 2.005f, 11.75f, 2.005f)
            lineTo(11.648f, 2.012f)
            curveTo(11.282f, 2.061f, 11f, 2.375f, 11f, 2.755f)
            lineTo(11f, 7.818f)
            close()
            moveTo(18.25f, 20.5f)
            curveTo(18.664f, 20.5f, 19f, 20.836f, 19f, 21.25f)
            curveTo(19f, 21.664f, 18.664f, 22f, 18.25f, 22f)
            lineTo(5.25f, 22.004f)
            curveTo(4.836f, 22.004f, 4.5f, 21.668f, 4.5f, 21.254f)
            curveTo(4.5f, 20.84f, 4.836f, 20.504f, 5.25f, 20.504f)
            lineTo(18.25f, 20.5f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun ArrowDownloadOffPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.ArrowDownloadOff, contentDescription = null)
    }
}
