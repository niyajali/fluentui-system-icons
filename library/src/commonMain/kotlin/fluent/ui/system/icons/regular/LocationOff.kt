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

public val FluentIcons.Regular.LocationOff: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.LocationOff",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(3.28f, 2.22f)
            curveTo(2.987f, 1.927f, 2.513f, 1.927f, 2.22f, 2.22f)
            curveTo(1.927f, 2.513f, 1.927f, 2.987f, 2.22f, 3.28f)
            lineTo(4.786f, 5.847f)
            curveTo(2.49f, 9.234f, 2.842f, 13.881f, 5.843f, 16.882f)
            curveTo(6.139f, 17.178f, 6.506f, 17.541f, 6.945f, 17.972f)
            lineTo(10.436f, 21.368f)
            curveTo(11.308f, 22.212f, 12.692f, 22.212f, 13.564f, 21.368f)
            curveTo(14.96f, 20.019f, 16.095f, 18.915f, 16.97f, 18.056f)
            lineTo(16.983f, 18.044f)
            lineTo(20.719f, 21.781f)
            curveTo(21.012f, 22.073f, 21.487f, 22.073f, 21.78f, 21.781f)
            curveTo(22.073f, 21.488f, 22.073f, 21.013f, 21.78f, 20.72f)
            lineTo(3.28f, 2.22f)
            close()
            moveTo(15.922f, 16.983f)
            curveTo(15.92f, 16.985f, 15.918f, 16.987f, 15.916f, 16.989f)
            lineTo(12.521f, 20.29f)
            curveTo(12.231f, 20.571f, 11.769f, 20.571f, 11.479f, 20.29f)
            curveTo(10.239f, 19.091f, 9.21f, 18.09f, 8.391f, 17.289f)
            lineTo(6.904f, 15.822f)
            curveTo(4.491f, 13.409f, 4.146f, 9.711f, 5.87f, 6.931f)
            lineTo(9.114f, 10.174f)
            curveTo(9.039f, 10.437f, 8.998f, 10.714f, 8.998f, 11f)
            curveTo(8.998f, 12.658f, 10.342f, 14.002f, 12f, 14.002f)
            curveTo(12.286f, 14.002f, 12.564f, 13.962f, 12.826f, 13.887f)
            lineTo(15.922f, 16.983f)
            close()
            moveTo(11.27f, 8.088f)
            lineTo(14.912f, 11.73f)
            curveTo(14.971f, 11.497f, 15.002f, 11.252f, 15.002f, 11f)
            curveTo(15.002f, 9.343f, 13.658f, 7.999f, 12f, 7.999f)
            curveTo(11.748f, 7.999f, 11.504f, 8.03f, 11.27f, 8.088f)
            close()
            moveTo(17.096f, 5.629f)
            curveTo(19.585f, 8.118f, 19.873f, 11.974f, 17.961f, 14.779f)
            lineTo(19.037f, 15.855f)
            curveTo(21.527f, 12.45f, 21.233f, 7.644f, 18.157f, 4.568f)
            curveTo(15.081f, 1.492f, 10.276f, 1.199f, 6.87f, 3.688f)
            lineTo(7.946f, 4.764f)
            curveTo(10.752f, 2.852f, 14.608f, 3.14f, 17.096f, 5.629f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun LocationOffPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.LocationOff, contentDescription = null)
    }
}
