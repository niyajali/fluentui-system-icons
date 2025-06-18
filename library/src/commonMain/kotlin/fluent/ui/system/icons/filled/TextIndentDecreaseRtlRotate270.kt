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

public val FluentIcons.Filled.TextIndentDecreaseRtlRotate270: ImageVector by
    lazy(LazyThreadSafetyMode.NONE) {
        ImageVector.Builder(
            name = "Filled.TextIndentDecreaseRtlRotate270",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(7f, 18.5f)
                curveTo(7.552f, 18.5f, 8f, 18.052f, 8f, 17.5f)
                verticalLineTo(9f)
                lineTo(7.993f, 8.883f)
                curveTo(7.936f, 8.386f, 7.513f, 8f, 7f, 8f)
                curveTo(6.448f, 8f, 6f, 8.448f, 6f, 9f)
                lineTo(6f, 17.5f)
                lineTo(6.007f, 17.617f)
                curveTo(6.064f, 18.114f, 6.487f, 18.5f, 7f, 18.5f)
                close()
                moveTo(13.001f, 20.5f)
                lineTo(13f, 9f)
                lineTo(12.993f, 8.883f)
                curveTo(12.935f, 8.386f, 12.513f, 8f, 12f, 8f)
                curveTo(11.448f, 8f, 11f, 8.448f, 11f, 9f)
                lineTo(11.001f, 20.5f)
                lineTo(11.008f, 20.617f)
                curveTo(11.066f, 21.114f, 11.488f, 21.5f, 12.001f, 21.5f)
                curveTo(12.554f, 21.5f, 13.001f, 21.052f, 13.001f, 20.5f)
                close()
                moveTo(17f, 18.5f)
                curveTo(17.552f, 18.5f, 18f, 18.052f, 18f, 17.5f)
                verticalLineTo(9f)
                lineTo(17.993f, 8.883f)
                curveTo(17.935f, 8.386f, 17.513f, 8f, 17f, 8f)
                curveTo(16.448f, 8f, 16f, 8.448f, 16f, 9f)
                verticalLineTo(17.5f)
                lineTo(16.007f, 17.617f)
                curveTo(16.065f, 18.114f, 16.487f, 18.5f, 17f, 18.5f)
                close()
                moveTo(14.79f, 4.387f)
                curveTo(15.095f, 4.779f, 15.068f, 5.347f, 14.707f, 5.707f)
                curveTo(14.317f, 6.098f, 13.683f, 6.098f, 13.293f, 5.707f)
                lineTo(12f, 4.414f)
                lineTo(10.707f, 5.707f)
                lineTo(10.613f, 5.79f)
                curveTo(10.221f, 6.095f, 9.653f, 6.068f, 9.293f, 5.707f)
                curveTo(8.902f, 5.317f, 8.902f, 4.683f, 9.293f, 4.293f)
                lineTo(11.293f, 2.293f)
                lineTo(11.387f, 2.21f)
                curveTo(11.779f, 1.905f, 12.347f, 1.932f, 12.707f, 2.293f)
                lineTo(14.707f, 4.293f)
                lineTo(14.79f, 4.387f)
                close()
            }
        }.build()
    }

@Preview
@Composable
private fun TextIndentDecreaseRtlRotate270Preview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.TextIndentDecreaseRtlRotate270, contentDescription = null)
    }
}
