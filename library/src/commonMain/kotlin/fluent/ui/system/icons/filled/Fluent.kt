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

public val FluentUi.Filled.Fluent: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.Fluent",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(12.585f, 2.082f)
            curveTo(12.374f, 1.976f, 12.126f, 1.976f, 11.915f, 2.082f)
            lineTo(5.915f, 5.082f)
            curveTo(5.661f, 5.209f, 5.5f, 5.468f, 5.5f, 5.753f)
            verticalLineTo(17.48f)
            curveTo(5.5f, 17.738f, 5.633f, 17.978f, 5.851f, 18.115f)
            lineTo(11.851f, 21.885f)
            curveTo(12.082f, 22.03f, 12.374f, 22.038f, 12.613f, 21.906f)
            curveTo(12.852f, 21.774f, 13f, 21.523f, 13f, 21.25f)
            verticalLineTo(15.216f)
            lineTo(18.585f, 12.423f)
            curveTo(18.84f, 12.296f, 19f, 12.037f, 19f, 11.752f)
            curveTo(19f, 11.468f, 18.84f, 11.209f, 18.585f, 11.082f)
            lineTo(13.927f, 8.753f)
            lineTo(18.585f, 6.423f)
            curveTo(18.84f, 6.296f, 19f, 6.037f, 19f, 5.753f)
            curveTo(19f, 5.468f, 18.84f, 5.209f, 18.585f, 5.082f)
            lineTo(12.585f, 2.082f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun FluentPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Filled.Fluent, contentDescription = null)
    }
}
