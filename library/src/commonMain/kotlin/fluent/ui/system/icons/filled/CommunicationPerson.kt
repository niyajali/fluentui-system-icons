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

public val FluentIcons.Filled.CommunicationPerson: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.CommunicationPerson",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(4f, 13f)
            curveTo(4f, 8.582f, 7.582f, 5f, 12f, 5f)
            curveTo(15.818f, 5f, 19.012f, 7.675f, 19.809f, 11.253f)
            curveTo(20.928f, 11.704f, 21.76f, 12.718f, 21.956f, 13.944f)
            curveTo(21.985f, 13.633f, 22f, 13.318f, 22f, 13f)
            curveTo(22f, 7.477f, 17.523f, 3f, 12f, 3f)
            curveTo(6.477f, 3f, 2f, 7.477f, 2f, 13f)
            curveTo(2f, 15.758f, 3.118f, 18.257f, 4.922f, 20.065f)
            curveTo(5.313f, 20.455f, 5.946f, 20.456f, 6.337f, 20.066f)
            curveTo(6.728f, 19.676f, 6.728f, 19.042f, 6.338f, 18.652f)
            curveTo(4.892f, 17.203f, 4f, 15.207f, 4f, 13f)
            close()
            moveTo(17.691f, 11.094f)
            curveTo(16.894f, 8.715f, 14.647f, 7f, 12f, 7f)
            curveTo(8.686f, 7f, 6f, 9.686f, 6f, 13f)
            curveTo(6f, 14.657f, 6.673f, 16.158f, 7.757f, 17.243f)
            curveTo(8.148f, 17.633f, 8.781f, 17.633f, 9.172f, 17.243f)
            curveTo(9.562f, 16.852f, 9.562f, 16.219f, 9.172f, 15.828f)
            curveTo(8.447f, 15.104f, 8f, 14.105f, 8f, 13f)
            curveTo(8f, 10.791f, 9.791f, 9f, 12f, 9f)
            curveTo(13.916f, 9f, 15.518f, 10.348f, 15.909f, 12.147f)
            curveTo(16.375f, 11.634f, 16.993f, 11.259f, 17.691f, 11.094f)
            close()
            moveTo(10f, 13f)
            curveTo(10f, 11.895f, 10.895f, 11f, 12f, 11f)
            curveTo(13.105f, 11f, 14f, 11.895f, 14f, 13f)
            curveTo(14f, 14.105f, 13.105f, 15f, 12f, 15f)
            curveTo(10.895f, 15f, 10f, 14.105f, 10f, 13f)
            close()
            moveTo(21f, 14.5f)
            curveTo(21f, 15.881f, 19.881f, 17f, 18.5f, 17f)
            curveTo(17.119f, 17f, 16f, 15.881f, 16f, 14.5f)
            curveTo(16f, 13.119f, 17.119f, 12f, 18.5f, 12f)
            curveTo(19.881f, 12f, 21f, 13.119f, 21f, 14.5f)
            close()
            moveTo(23f, 19.875f)
            curveTo(23f, 21.431f, 21.714f, 23f, 18.5f, 23f)
            curveTo(15.286f, 23f, 14f, 21.437f, 14f, 19.875f)
            verticalLineTo(19.772f)
            curveTo(14f, 18.793f, 14.794f, 18f, 15.773f, 18f)
            horizontalLineTo(21.227f)
            curveTo(22.206f, 18f, 23f, 18.793f, 23f, 19.772f)
            verticalLineTo(19.875f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun CommunicationPersonPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.CommunicationPerson, contentDescription = null)
    }
}
