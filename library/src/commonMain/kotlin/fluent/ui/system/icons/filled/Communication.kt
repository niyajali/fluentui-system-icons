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

public val FluentUi.Filled.Communication: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.Communication",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(12f, 5f)
            curveTo(7.582f, 5f, 4f, 8.582f, 4f, 13f)
            curveTo(4f, 15.207f, 4.892f, 17.203f, 6.338f, 18.652f)
            curveTo(6.728f, 19.042f, 6.728f, 19.676f, 6.337f, 20.066f)
            curveTo(5.946f, 20.456f, 5.313f, 20.455f, 4.922f, 20.065f)
            curveTo(3.118f, 18.257f, 2f, 15.758f, 2f, 13f)
            curveTo(2f, 7.477f, 6.477f, 3f, 12f, 3f)
            curveTo(17.523f, 3f, 22f, 7.477f, 22f, 13f)
            curveTo(22f, 15.758f, 20.882f, 18.257f, 19.077f, 20.065f)
            curveTo(18.687f, 20.455f, 18.054f, 20.456f, 17.663f, 20.066f)
            curveTo(17.272f, 19.676f, 17.272f, 19.042f, 17.662f, 18.652f)
            curveTo(19.108f, 17.203f, 20f, 15.207f, 20f, 13f)
            curveTo(20f, 8.582f, 16.418f, 5f, 12f, 5f)
            close()
            moveTo(12f, 11f)
            curveTo(10.895f, 11f, 10f, 11.895f, 10f, 13f)
            curveTo(10f, 14.105f, 10.895f, 15f, 12f, 15f)
            curveTo(13.105f, 15f, 14f, 14.105f, 14f, 13f)
            curveTo(14f, 11.895f, 13.105f, 11f, 12f, 11f)
            close()
            moveTo(8f, 13f)
            curveTo(8f, 10.791f, 9.791f, 9f, 12f, 9f)
            curveTo(14.209f, 9f, 16f, 10.791f, 16f, 13f)
            curveTo(16f, 14.105f, 15.553f, 15.104f, 14.828f, 15.828f)
            curveTo(14.438f, 16.219f, 14.438f, 16.852f, 14.828f, 17.243f)
            curveTo(15.219f, 17.633f, 15.852f, 17.633f, 16.243f, 17.243f)
            curveTo(17.327f, 16.158f, 18f, 14.657f, 18f, 13f)
            curveTo(18f, 9.686f, 15.314f, 7f, 12f, 7f)
            curveTo(8.686f, 7f, 6f, 9.686f, 6f, 13f)
            curveTo(6f, 14.657f, 6.673f, 16.158f, 7.757f, 17.243f)
            curveTo(8.148f, 17.633f, 8.781f, 17.633f, 9.172f, 17.243f)
            curveTo(9.562f, 16.852f, 9.562f, 16.219f, 9.172f, 15.828f)
            curveTo(8.447f, 15.104f, 8f, 14.105f, 8f, 13f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun CommunicationPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Filled.Communication, contentDescription = null)
    }
}
