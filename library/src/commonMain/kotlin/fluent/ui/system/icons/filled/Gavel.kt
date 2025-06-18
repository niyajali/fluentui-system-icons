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

public val FluentIcons.Filled.Gavel: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.Gavel",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(10.729f, 2.712f)
            curveTo(11.706f, 1.734f, 13.326f, 1.861f, 14.139f, 2.979f)
            lineTo(14.46f, 3.42f)
            lineTo(7.986f, 9.893f)
            lineTo(7.607f, 9.64f)
            curveTo(6.425f, 8.852f, 6.26f, 7.181f, 7.264f, 6.177f)
            lineTo(10.729f, 2.712f)
            close()
            moveTo(9.259f, 10.742f)
            lineTo(11.821f, 12.449f)
            curveTo(11.908f, 12.507f, 11.981f, 12.583f, 12.037f, 12.671f)
            lineTo(13.271f, 14.609f)
            lineTo(19.282f, 8.597f)
            lineTo(17.133f, 7.034f)
            curveTo(17.069f, 6.987f, 17.014f, 6.932f, 16.967f, 6.868f)
            lineTo(15.353f, 4.648f)
            lineTo(9.259f, 10.742f)
            close()
            moveTo(14.363f, 16.326f)
            lineTo(14.096f, 15.905f)
            lineTo(20.511f, 9.49f)
            lineTo(21.022f, 9.862f)
            curveTo(22.14f, 10.675f, 22.267f, 12.295f, 21.289f, 13.273f)
            lineTo(17.853f, 16.709f)
            curveTo(16.835f, 17.727f, 15.136f, 17.54f, 14.363f, 16.326f)
            close()
            moveTo(9.341f, 12.299f)
            lineTo(3.268f, 18.257f)
            curveTo(2.57f, 18.942f, 2.565f, 20.065f, 3.256f, 20.757f)
            curveTo(3.943f, 21.444f, 5.057f, 21.444f, 5.744f, 20.757f)
            lineTo(11.829f, 14.672f)
            lineTo(11.039f, 13.431f)
            lineTo(9.341f, 12.299f)
            close()
            moveTo(14.75f, 19.001f)
            curveTo(14.336f, 19.001f, 14f, 19.337f, 14f, 19.751f)
            curveTo(14f, 20.165f, 14.336f, 20.501f, 14.75f, 20.501f)
            horizontalLineTo(12.75f)
            curveTo(12.336f, 20.501f, 12f, 20.837f, 12f, 21.251f)
            curveTo(12f, 21.665f, 12.336f, 22.001f, 12.75f, 22.001f)
            horizontalLineTo(21.25f)
            curveTo(21.664f, 22.001f, 22f, 21.665f, 22f, 21.251f)
            curveTo(22f, 20.837f, 21.664f, 20.501f, 21.25f, 20.501f)
            horizontalLineTo(19.25f)
            curveTo(19.664f, 20.501f, 20f, 20.165f, 20f, 19.751f)
            curveTo(20f, 19.337f, 19.664f, 19.001f, 19.25f, 19.001f)
            horizontalLineTo(14.75f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun GavelPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.Gavel, contentDescription = null)
    }
}
