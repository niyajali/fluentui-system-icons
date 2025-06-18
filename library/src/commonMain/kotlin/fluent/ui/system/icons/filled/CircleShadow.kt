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

public val FluentUi.Filled.CircleShadow: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.CircleShadow",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(14.694f, 21.633f)
            curveTo(15.169f, 21.5f, 15.63f, 21.333f, 16.074f, 21.135f)
            lineTo(12.22f, 17.28f)
            curveTo(11.927f, 16.987f, 11.927f, 16.513f, 12.22f, 16.22f)
            curveTo(12.513f, 15.927f, 12.987f, 15.927f, 13.28f, 16.22f)
            lineTo(17.448f, 20.387f)
            curveTo(17.824f, 20.142f, 18.182f, 19.873f, 18.521f, 19.582f)
            lineTo(14.72f, 15.78f)
            curveTo(14.427f, 15.487f, 14.427f, 15.013f, 14.72f, 14.72f)
            curveTo(15.013f, 14.427f, 15.487f, 14.427f, 15.78f, 14.72f)
            lineTo(19.582f, 18.521f)
            curveTo(19.873f, 18.182f, 20.142f, 17.824f, 20.387f, 17.448f)
            lineTo(16.22f, 13.28f)
            curveTo(15.927f, 12.987f, 15.927f, 12.513f, 16.22f, 12.22f)
            curveTo(16.513f, 11.927f, 16.987f, 11.927f, 17.28f, 12.22f)
            lineTo(21.135f, 16.074f)
            curveTo(21.333f, 15.63f, 21.5f, 15.169f, 21.633f, 14.694f)
            lineTo(17.22f, 10.28f)
            curveTo(16.927f, 9.987f, 16.927f, 9.513f, 17.22f, 9.22f)
            curveTo(17.513f, 8.927f, 17.987f, 8.927f, 18.28f, 9.22f)
            lineTo(21.96f, 12.899f)
            curveTo(21.986f, 12.603f, 22f, 12.303f, 22f, 12f)
            curveTo(22f, 11.667f, 21.984f, 11.337f, 21.952f, 11.012f)
            lineTo(17.47f, 6.53f)
            curveTo(17.177f, 6.237f, 17.177f, 5.763f, 17.47f, 5.47f)
            curveTo(17.763f, 5.177f, 18.237f, 5.177f, 18.53f, 5.47f)
            lineTo(21.247f, 8.186f)
            curveTo(19.748f, 4.555f, 16.172f, 2f, 12f, 2f)
            curveTo(6.477f, 2f, 2f, 6.477f, 2f, 12f)
            curveTo(2f, 16.172f, 4.555f, 19.748f, 8.186f, 21.247f)
            lineTo(5.47f, 18.53f)
            curveTo(5.177f, 18.237f, 5.177f, 17.763f, 5.47f, 17.47f)
            curveTo(5.763f, 17.177f, 6.237f, 17.177f, 6.53f, 17.47f)
            lineTo(11.012f, 21.952f)
            curveTo(11.337f, 21.984f, 11.667f, 22f, 12f, 22f)
            curveTo(12.303f, 22f, 12.603f, 21.986f, 12.899f, 21.96f)
            lineTo(9.22f, 18.28f)
            curveTo(8.927f, 17.987f, 8.927f, 17.513f, 9.22f, 17.22f)
            curveTo(9.513f, 16.927f, 9.987f, 16.927f, 10.28f, 17.22f)
            lineTo(14.694f, 21.633f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun CircleShadowPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Filled.CircleShadow, contentDescription = null)
    }
}
