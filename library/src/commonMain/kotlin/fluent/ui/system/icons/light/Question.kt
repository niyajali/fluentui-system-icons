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

public val FluentIcons.Light.Question: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Light.Question",
        defaultWidth = 32.dp,
        defaultHeight = 32.dp,
        viewportWidth = 32f,
        viewportHeight = 32f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(10f, 11f)
            curveTo(10f, 7.686f, 12.686f, 5f, 16f, 5f)
            curveTo(19.314f, 5f, 22f, 7.686f, 22f, 11f)
            curveTo(22f, 12.677f, 21.615f, 13.698f, 21.08f, 14.434f)
            curveTo(20.577f, 15.126f, 19.924f, 15.598f, 19.18f, 16.137f)
            curveTo(19.106f, 16.19f, 19.031f, 16.244f, 18.956f, 16.299f)
            curveTo(18.136f, 16.896f, 17.251f, 17.582f, 16.586f, 18.695f)
            curveTo(15.919f, 19.812f, 15.5f, 21.31f, 15.5f, 23.5f)
            curveTo(15.5f, 23.776f, 15.724f, 24f, 16f, 24f)
            curveTo(16.276f, 24f, 16.5f, 23.776f, 16.5f, 23.5f)
            curveTo(16.5f, 21.44f, 16.893f, 20.131f, 17.445f, 19.208f)
            curveTo(17.999f, 18.28f, 18.739f, 17.693f, 19.544f, 17.107f)
            curveTo(19.621f, 17.052f, 19.698f, 16.996f, 19.776f, 16.94f)
            curveTo(20.503f, 16.416f, 21.287f, 15.85f, 21.889f, 15.023f)
            curveTo(22.572f, 14.083f, 23f, 12.844f, 23f, 11f)
            curveTo(23f, 7.134f, 19.866f, 4f, 16f, 4f)
            curveTo(12.134f, 4f, 9f, 7.134f, 9f, 11f)
            curveTo(9f, 11.276f, 9.224f, 11.5f, 9.5f, 11.5f)
            curveTo(9.776f, 11.5f, 10f, 11.276f, 10f, 11f)
            close()
            moveTo(16f, 29f)
            curveTo(16.552f, 29f, 17f, 28.552f, 17f, 28f)
            curveTo(17f, 27.448f, 16.552f, 27f, 16f, 27f)
            curveTo(15.448f, 27f, 15f, 27.448f, 15f, 28f)
            curveTo(15f, 28.552f, 15.448f, 29f, 16f, 29f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun QuestionPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Light.Question, contentDescription = null)
    }
}
