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

public val FluentUi.Regular.Fluent: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.Fluent",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(11.915f, 2.082f)
            curveTo(12.126f, 1.976f, 12.374f, 1.976f, 12.585f, 2.082f)
            lineTo(18.585f, 5.082f)
            curveTo(18.84f, 5.209f, 19f, 5.468f, 19f, 5.753f)
            curveTo(19f, 6.037f, 18.84f, 6.296f, 18.585f, 6.423f)
            lineTo(13.927f, 8.753f)
            lineTo(18.585f, 11.082f)
            curveTo(18.84f, 11.209f, 19f, 11.468f, 19f, 11.752f)
            curveTo(19f, 12.037f, 18.84f, 12.296f, 18.585f, 12.423f)
            lineTo(13f, 15.216f)
            verticalLineTo(21.25f)
            curveTo(13f, 21.523f, 12.852f, 21.774f, 12.613f, 21.906f)
            curveTo(12.374f, 22.038f, 12.082f, 22.03f, 11.851f, 21.885f)
            lineTo(5.851f, 18.115f)
            curveTo(5.633f, 17.978f, 5.5f, 17.738f, 5.5f, 17.48f)
            verticalLineTo(5.753f)
            curveTo(5.5f, 5.468f, 5.661f, 5.209f, 5.915f, 5.082f)
            lineTo(11.915f, 2.082f)
            close()
            moveTo(7f, 6.216f)
            verticalLineTo(17.066f)
            lineTo(11.5f, 19.893f)
            verticalLineTo(14.752f)
            curveTo(11.5f, 14.468f, 11.66f, 14.209f, 11.915f, 14.082f)
            lineTo(16.573f, 11.752f)
            lineTo(11.915f, 9.423f)
            curveTo(11.66f, 9.296f, 11.5f, 9.037f, 11.5f, 8.753f)
            curveTo(11.5f, 8.468f, 11.66f, 8.209f, 11.915f, 8.082f)
            lineTo(16.573f, 5.753f)
            lineTo(12.25f, 3.591f)
            lineTo(7f, 6.216f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun FluentPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Regular.Fluent, contentDescription = null)
    }
}
