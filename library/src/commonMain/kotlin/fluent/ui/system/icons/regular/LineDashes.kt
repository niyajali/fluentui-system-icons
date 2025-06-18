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
import fluent.ui.system.icons.FluentUi
import org.jetbrains.compose.ui.tooling.preview.Preview

public val FluentUi.Regular.LineDashes: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.LineDashes",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(21.785f, 2.223f)
            curveTo(22.078f, 2.515f, 22.078f, 2.99f, 21.785f, 3.283f)
            lineTo(20.784f, 4.284f)
            curveTo(20.491f, 4.577f, 20.017f, 4.577f, 19.724f, 4.284f)
            curveTo(19.431f, 3.991f, 19.431f, 3.516f, 19.724f, 3.223f)
            lineTo(20.724f, 2.223f)
            curveTo(21.017f, 1.93f, 21.492f, 1.93f, 21.785f, 2.223f)
            close()
            moveTo(17.777f, 6.223f)
            curveTo(18.07f, 6.515f, 18.07f, 6.99f, 17.777f, 7.283f)
            lineTo(16.277f, 8.783f)
            curveTo(15.984f, 9.076f, 15.51f, 9.076f, 15.217f, 8.783f)
            curveTo(14.924f, 8.49f, 14.924f, 8.015f, 15.217f, 7.723f)
            lineTo(16.717f, 6.223f)
            curveTo(17.01f, 5.93f, 17.485f, 5.93f, 17.777f, 6.223f)
            close()
            moveTo(13.28f, 10.72f)
            curveTo(13.573f, 11.013f, 13.573f, 11.487f, 13.28f, 11.78f)
            lineTo(11.78f, 13.28f)
            curveTo(11.487f, 13.573f, 11.013f, 13.573f, 10.72f, 13.28f)
            curveTo(10.427f, 12.987f, 10.427f, 12.513f, 10.72f, 12.22f)
            lineTo(12.22f, 10.72f)
            curveTo(12.513f, 10.427f, 12.987f, 10.427f, 13.28f, 10.72f)
            close()
            moveTo(8.777f, 16.283f)
            curveTo(9.07f, 15.99f, 9.07f, 15.516f, 8.777f, 15.223f)
            curveTo(8.485f, 14.93f, 8.01f, 14.93f, 7.717f, 15.223f)
            lineTo(6.217f, 16.723f)
            curveTo(5.924f, 17.015f, 5.924f, 17.49f, 6.217f, 17.783f)
            curveTo(6.51f, 18.076f, 6.985f, 18.076f, 7.277f, 17.783f)
            lineTo(8.777f, 16.283f)
            close()
            moveTo(4.281f, 20.78f)
            curveTo(4.574f, 20.487f, 4.574f, 20.013f, 4.281f, 19.72f)
            curveTo(3.988f, 19.427f, 3.513f, 19.427f, 3.22f, 19.72f)
            lineTo(2.22f, 20.721f)
            curveTo(1.927f, 21.013f, 1.927f, 21.488f, 2.22f, 21.781f)
            curveTo(2.513f, 22.074f, 2.987f, 22.074f, 3.28f, 21.781f)
            lineTo(4.281f, 20.78f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun LineDashesPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Regular.LineDashes, contentDescription = null)
    }
}
