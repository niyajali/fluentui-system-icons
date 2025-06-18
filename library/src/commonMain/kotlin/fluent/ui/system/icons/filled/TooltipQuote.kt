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

public val FluentUi.Filled.TooltipQuote: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.TooltipQuote",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(4.25f, 2f)
            curveTo(3.007f, 2f, 2f, 3.007f, 2f, 4.25f)
            lineTo(2f, 11.75f)
            curveTo(2f, 12.993f, 3.007f, 14f, 4.25f, 14f)
            horizontalLineTo(6.192f)
            lineTo(8.086f, 17.599f)
            curveTo(8.216f, 17.846f, 8.471f, 18f, 8.75f, 18f)
            curveTo(9.028f, 18f, 9.284f, 17.846f, 9.414f, 17.599f)
            lineTo(11.308f, 14f)
            horizontalLineTo(13.25f)
            curveTo(14.493f, 14f, 15.5f, 12.993f, 15.5f, 11.75f)
            verticalLineTo(4.25f)
            curveTo(15.5f, 3.007f, 14.493f, 2f, 13.25f, 2f)
            horizontalLineTo(4.25f)
            close()
            moveTo(5.5f, 6.25f)
            curveTo(5.5f, 5.836f, 5.836f, 5.5f, 6.25f, 5.5f)
            horizontalLineTo(7.75f)
            curveTo(8.164f, 5.5f, 8.5f, 5.836f, 8.5f, 6.25f)
            curveTo(8.5f, 8.401f, 7.212f, 9.849f, 6.78f, 10.28f)
            curveTo(6.487f, 10.573f, 6.013f, 10.573f, 5.72f, 10.28f)
            curveTo(5.427f, 9.987f, 5.427f, 9.513f, 5.72f, 9.22f)
            curveTo(5.92f, 9.019f, 6.332f, 8.558f, 6.635f, 7.894f)
            curveTo(6.522f, 7.961f, 6.391f, 8f, 6.25f, 8f)
            curveTo(5.836f, 8f, 5.5f, 7.664f, 5.5f, 7.25f)
            verticalLineTo(6.25f)
            close()
            moveTo(9.5f, 6.25f)
            curveTo(9.5f, 5.836f, 9.836f, 5.5f, 10.25f, 5.5f)
            horizontalLineTo(11.75f)
            curveTo(12.164f, 5.5f, 12.5f, 5.836f, 12.5f, 6.25f)
            curveTo(12.5f, 8.401f, 11.212f, 9.849f, 10.78f, 10.28f)
            curveTo(10.487f, 10.573f, 10.013f, 10.573f, 9.72f, 10.28f)
            curveTo(9.427f, 9.987f, 9.427f, 9.513f, 9.72f, 9.22f)
            curveTo(9.92f, 9.019f, 10.332f, 8.558f, 10.635f, 7.894f)
            curveTo(10.522f, 7.961f, 10.391f, 8f, 10.25f, 8f)
            curveTo(9.836f, 8f, 9.5f, 7.664f, 9.5f, 7.25f)
            verticalLineTo(6.25f)
            close()
            moveTo(2.75f, 16.5f)
            horizontalLineTo(6.378f)
            lineTo(7.167f, 18f)
            horizontalLineTo(2.75f)
            curveTo(2.336f, 18f, 2f, 17.664f, 2f, 17.25f)
            curveTo(2f, 16.836f, 2.336f, 16.5f, 2.75f, 16.5f)
            close()
            moveTo(21.25f, 18f)
            horizontalLineTo(10.333f)
            lineTo(11.122f, 16.5f)
            horizontalLineTo(21.25f)
            curveTo(21.664f, 16.5f, 22f, 16.836f, 22f, 17.25f)
            curveTo(22f, 17.664f, 21.664f, 18f, 21.25f, 18f)
            close()
            moveTo(2f, 21.25f)
            curveTo(2f, 20.836f, 2.336f, 20.5f, 2.75f, 20.5f)
            horizontalLineTo(14.75f)
            curveTo(15.164f, 20.5f, 15.5f, 20.836f, 15.5f, 21.25f)
            curveTo(15.5f, 21.664f, 15.164f, 22f, 14.75f, 22f)
            horizontalLineTo(2.75f)
            curveTo(2.336f, 22f, 2f, 21.664f, 2f, 21.25f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun TooltipQuotePreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Filled.TooltipQuote, contentDescription = null)
    }
}
