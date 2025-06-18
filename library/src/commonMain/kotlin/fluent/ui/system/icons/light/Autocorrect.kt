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

public val FluentIcons.Light.Autocorrect: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Light.Autocorrect",
        defaultWidth = 32.dp,
        defaultHeight = 32.dp,
        viewportWidth = 32f,
        viewportHeight = 32f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(13.895f, 7.151f)
            curveTo(14.878f, 5.616f, 17.121f, 5.616f, 18.104f, 7.151f)
            lineTo(21.853f, 13f)
            horizontalLineTo(19.5f)
            curveTo(15.91f, 13f, 13f, 15.91f, 13f, 19.5f)
            curveTo(13f, 23.09f, 15.91f, 26f, 19.5f, 26f)
            curveTo(23.09f, 26f, 26f, 23.09f, 26f, 19.5f)
            curveTo(26f, 18.368f, 25.711f, 17.304f, 25.202f, 16.377f)
            curveTo(25.194f, 16.361f, 25.186f, 16.346f, 25.177f, 16.332f)
            curveTo(25.049f, 16.104f, 24.909f, 15.885f, 24.756f, 15.675f)
            lineTo(23.682f, 14f)
            horizontalLineTo(29.5f)
            curveTo(29.776f, 14f, 30f, 13.776f, 30f, 13.5f)
            curveTo(30f, 13.224f, 29.776f, 13f, 29.5f, 13f)
            horizontalLineTo(23.041f)
            lineTo(18.946f, 6.611f)
            curveTo(17.569f, 4.463f, 14.43f, 4.463f, 13.053f, 6.611f)
            lineTo(2.079f, 23.731f)
            curveTo(1.93f, 23.963f, 1.998f, 24.273f, 2.23f, 24.422f)
            curveTo(2.463f, 24.571f, 2.772f, 24.503f, 2.921f, 24.271f)
            lineTo(13.895f, 7.151f)
            close()
            moveTo(23.931f, 16.242f)
            lineTo(24.316f, 16.842f)
            curveTo(24.752f, 17.63f, 25f, 18.536f, 25f, 19.5f)
            curveTo(25f, 22.538f, 22.537f, 25f, 19.5f, 25f)
            curveTo(16.462f, 25f, 14f, 22.538f, 14f, 19.5f)
            curveTo(14f, 16.462f, 16.462f, 14f, 19.5f, 14f)
            curveTo(21.318f, 14f, 22.93f, 14.882f, 23.931f, 16.242f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun AutocorrectPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Light.Autocorrect, contentDescription = null)
    }
}
