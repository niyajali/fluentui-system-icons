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
package fluent.ui.system.icons.light

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

public val FluentIcons.Light.Important: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Light.Important",
        defaultWidth = 32.dp,
        defaultHeight = 32.dp,
        viewportWidth = 32f,
        viewportHeight = 32f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(16f, 2f)
            curveTo(12.686f, 2f, 10f, 4.686f, 10f, 8f)
            curveTo(10f, 11.523f, 11.986f, 16.536f, 13.159f, 19.19f)
            curveTo(13.655f, 20.31f, 14.774f, 21f, 16f, 21f)
            curveTo(17.226f, 21f, 18.345f, 20.31f, 18.841f, 19.19f)
            curveTo(20.014f, 16.536f, 22f, 11.523f, 22f, 8f)
            curveTo(22f, 4.686f, 19.314f, 2f, 16f, 2f)
            close()
            moveTo(11f, 8f)
            curveTo(11f, 5.239f, 13.239f, 3f, 16f, 3f)
            curveTo(18.761f, 3f, 21f, 5.239f, 21f, 8f)
            curveTo(21f, 9.605f, 20.541f, 11.622f, 19.907f, 13.618f)
            curveTo(19.279f, 15.596f, 18.505f, 17.477f, 17.926f, 18.785f)
            curveTo(17.6f, 19.524f, 16.853f, 20f, 16f, 20f)
            curveTo(15.147f, 20f, 14.4f, 19.524f, 14.074f, 18.785f)
            curveTo(13.495f, 17.477f, 12.721f, 15.596f, 12.093f, 13.618f)
            curveTo(11.459f, 11.622f, 11f, 9.605f, 11f, 8f)
            close()
            moveTo(19f, 27f)
            curveTo(19f, 28.657f, 17.657f, 30f, 16f, 30f)
            curveTo(14.343f, 30f, 13f, 28.657f, 13f, 27f)
            curveTo(13f, 25.343f, 14.343f, 24f, 16f, 24f)
            curveTo(17.657f, 24f, 19f, 25.343f, 19f, 27f)
            close()
            moveTo(18f, 27f)
            curveTo(18f, 25.895f, 17.105f, 25f, 16f, 25f)
            curveTo(14.895f, 25f, 14f, 25.895f, 14f, 27f)
            curveTo(14f, 28.105f, 14.895f, 29f, 16f, 29f)
            curveTo(17.105f, 29f, 18f, 28.105f, 18f, 27f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun ImportantPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Light.Important, contentDescription = null)
    }
}
