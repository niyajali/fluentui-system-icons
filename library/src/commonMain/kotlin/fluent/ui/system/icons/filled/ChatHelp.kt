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

public val FluentUi.Filled.ChatHelp: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.ChatHelp",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(12f, 2f)
            curveTo(17.523f, 2f, 22f, 6.477f, 22f, 12f)
            curveTo(22f, 17.523f, 17.523f, 22f, 12f, 22f)
            curveTo(10.36f, 22f, 8.775f, 21.604f, 7.356f, 20.858f)
            lineTo(3.065f, 21.975f)
            curveTo(2.611f, 22.094f, 2.147f, 21.821f, 2.029f, 21.367f)
            curveTo(1.992f, 21.227f, 1.992f, 21.079f, 2.029f, 20.939f)
            lineTo(3.145f, 16.65f)
            curveTo(2.397f, 15.229f, 2f, 13.643f, 2f, 12f)
            curveTo(2f, 6.477f, 6.477f, 2f, 12f, 2f)
            close()
            moveTo(12f, 15.5f)
            curveTo(11.448f, 15.5f, 11f, 15.948f, 11f, 16.5f)
            curveTo(11f, 17.052f, 11.448f, 17.5f, 12f, 17.5f)
            curveTo(12.552f, 17.5f, 13f, 17.052f, 13f, 16.5f)
            curveTo(13f, 15.948f, 12.552f, 15.5f, 12f, 15.5f)
            close()
            moveTo(12f, 6.75f)
            curveTo(10.481f, 6.75f, 9.25f, 7.981f, 9.25f, 9.5f)
            curveTo(9.25f, 9.914f, 9.586f, 10.25f, 10f, 10.25f)
            curveTo(10.38f, 10.25f, 10.693f, 9.968f, 10.743f, 9.602f)
            lineTo(10.757f, 9.372f)
            curveTo(10.821f, 8.742f, 11.353f, 8.25f, 12f, 8.25f)
            curveTo(12.69f, 8.25f, 13.25f, 8.81f, 13.25f, 9.5f)
            curveTo(13.25f, 10.039f, 13.115f, 10.305f, 12.605f, 10.832f)
            lineTo(12.301f, 11.141f)
            curveTo(11.547f, 11.926f, 11.25f, 12.489f, 11.25f, 13.5f)
            curveTo(11.25f, 13.914f, 11.586f, 14.25f, 12f, 14.25f)
            curveTo(12.414f, 14.25f, 12.75f, 13.914f, 12.75f, 13.5f)
            curveTo(12.75f, 12.961f, 12.885f, 12.695f, 13.395f, 12.168f)
            lineTo(13.699f, 11.859f)
            curveTo(14.453f, 11.074f, 14.75f, 10.511f, 14.75f, 9.5f)
            curveTo(14.75f, 7.981f, 13.519f, 6.75f, 12f, 6.75f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun ChatHelpPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Filled.ChatHelp, contentDescription = null)
    }
}
