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

public val FluentUi.Regular.Autocorrect: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.Autocorrect",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(13.461f, 4.934f)
            curveTo(13.754f, 5.118f, 14.009f, 5.355f, 14.213f, 5.632f)
            lineTo(14.33f, 5.803f)
            lineTo(17.275f, 10.499f)
            lineTo(21.5f, 10.5f)
            curveTo(21.88f, 10.5f, 22.194f, 10.782f, 22.243f, 11.148f)
            lineTo(22.25f, 11.25f)
            curveTo(22.25f, 11.664f, 21.914f, 12f, 21.5f, 12f)
            lineTo(18.216f, 11.999f)
            lineTo(18.222f, 12.008f)
            lineTo(18.213f, 11.999f)
            curveTo(19.011f, 12.848f, 19.5f, 13.992f, 19.5f, 15.25f)
            curveTo(19.5f, 17.873f, 17.374f, 20f, 14.75f, 20f)
            curveTo(12.127f, 20f, 10f, 17.873f, 10f, 15.25f)
            curveTo(10f, 12.626f, 12.127f, 10.5f, 14.75f, 10.5f)
            lineTo(15.506f, 10.499f)
            lineTo(13.059f, 6.6f)
            curveTo(12.959f, 6.44f, 12.824f, 6.305f, 12.664f, 6.205f)
            curveTo(12.118f, 5.863f, 11.41f, 5.994f, 11.02f, 6.488f)
            lineTo(10.941f, 6.6f)
            lineTo(3.385f, 18.648f)
            curveTo(3.165f, 18.999f, 2.703f, 19.105f, 2.352f, 18.885f)
            curveTo(2.033f, 18.685f, 1.916f, 18.284f, 2.063f, 17.949f)
            lineTo(2.115f, 17.851f)
            lineTo(9.67f, 5.803f)
            curveTo(10.477f, 4.516f, 12.174f, 4.127f, 13.461f, 4.934f)
            close()
            moveTo(14.75f, 12f)
            curveTo(12.955f, 12f, 11.5f, 13.455f, 11.5f, 15.25f)
            curveTo(11.5f, 17.045f, 12.955f, 18.5f, 14.75f, 18.5f)
            curveTo(16.545f, 18.5f, 18f, 17.045f, 18f, 15.25f)
            curveTo(18f, 13.455f, 16.545f, 12f, 14.75f, 12f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun AutocorrectPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Regular.Autocorrect, contentDescription = null)
    }
}
