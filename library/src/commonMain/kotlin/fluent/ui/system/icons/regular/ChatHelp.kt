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

public val FluentIcons.Regular.ChatHelp: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.ChatHelp",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(12f, 2f)
            curveTo(17.523f, 2f, 22f, 6.477f, 22f, 12f)
            curveTo(22f, 17.523f, 17.523f, 22f, 12f, 22f)
            curveTo(10.382f, 22f, 8.818f, 21.615f, 7.413f, 20.888f)
            lineTo(3.587f, 21.955f)
            curveTo(2.922f, 22.141f, 2.233f, 21.753f, 2.047f, 21.088f)
            curveTo(1.985f, 20.868f, 1.985f, 20.635f, 2.047f, 20.415f)
            lineTo(3.115f, 16.592f)
            curveTo(2.386f, 15.186f, 2f, 13.62f, 2f, 12f)
            curveTo(2f, 6.477f, 6.477f, 2f, 12f, 2f)
            close()
            moveTo(12f, 3.5f)
            curveTo(7.306f, 3.5f, 3.5f, 7.306f, 3.5f, 12f)
            curveTo(3.5f, 13.47f, 3.873f, 14.883f, 4.573f, 16.138f)
            lineTo(4.724f, 16.407f)
            lineTo(3.611f, 20.391f)
            lineTo(7.598f, 19.279f)
            lineTo(7.867f, 19.43f)
            curveTo(9.12f, 20.128f, 10.532f, 20.5f, 12f, 20.5f)
            curveTo(16.694f, 20.5f, 20.5f, 16.694f, 20.5f, 12f)
            curveTo(20.5f, 7.306f, 16.694f, 3.5f, 12f, 3.5f)
            close()
            moveTo(12f, 15.5f)
            curveTo(12.552f, 15.5f, 13f, 15.948f, 13f, 16.5f)
            curveTo(13f, 17.052f, 12.552f, 17.5f, 12f, 17.5f)
            curveTo(11.448f, 17.5f, 11f, 17.052f, 11f, 16.5f)
            curveTo(11f, 15.948f, 11.448f, 15.5f, 12f, 15.5f)
            close()
            moveTo(12f, 6.75f)
            curveTo(13.519f, 6.75f, 14.75f, 7.981f, 14.75f, 9.5f)
            curveTo(14.75f, 10.511f, 14.453f, 11.074f, 13.699f, 11.859f)
            lineTo(13.53f, 12.03f)
            curveTo(12.908f, 12.652f, 12.75f, 12.916f, 12.75f, 13.5f)
            curveTo(12.75f, 13.914f, 12.414f, 14.25f, 12f, 14.25f)
            curveTo(11.586f, 14.25f, 11.25f, 13.914f, 11.25f, 13.5f)
            curveTo(11.25f, 12.489f, 11.547f, 11.926f, 12.301f, 11.141f)
            lineTo(12.47f, 10.97f)
            curveTo(13.092f, 10.348f, 13.25f, 10.084f, 13.25f, 9.5f)
            curveTo(13.25f, 8.81f, 12.69f, 8.25f, 12f, 8.25f)
            curveTo(11.353f, 8.25f, 10.821f, 8.742f, 10.757f, 9.372f)
            lineTo(10.75f, 9.5f)
            curveTo(10.75f, 9.914f, 10.414f, 10.25f, 10f, 10.25f)
            curveTo(9.586f, 10.25f, 9.25f, 9.914f, 9.25f, 9.5f)
            curveTo(9.25f, 7.981f, 10.481f, 6.75f, 12f, 6.75f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun ChatHelpPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.ChatHelp, contentDescription = null)
    }
}
