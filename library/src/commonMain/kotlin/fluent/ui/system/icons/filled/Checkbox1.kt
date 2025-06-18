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

public val FluentIcons.Filled.Checkbox1: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.Checkbox1",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(6.25f, 3f)
            curveTo(4.455f, 3f, 3f, 4.455f, 3f, 6.25f)
            verticalLineTo(17.75f)
            curveTo(3f, 19.545f, 4.455f, 21f, 6.25f, 21f)
            horizontalLineTo(17.75f)
            curveTo(18.394f, 21f, 18.995f, 20.813f, 19.5f, 20.489f)
            verticalLineTo(18.832f)
            curveTo(18.783f, 19.172f, 17.901f, 18.99f, 17.383f, 18.343f)
            curveTo(16.78f, 17.588f, 16.902f, 16.487f, 17.657f, 15.884f)
            lineTo(20.157f, 13.884f)
            curveTo(20.312f, 13.759f, 20.485f, 13.664f, 20.667f, 13.6f)
            curveTo(20.775f, 13.562f, 20.887f, 13.534f, 21f, 13.518f)
            verticalLineTo(6.25f)
            curveTo(21f, 4.455f, 19.545f, 3f, 17.75f, 3f)
            horizontalLineTo(6.25f)
            close()
            moveTo(17.28f, 9.281f)
            lineTo(10.526f, 16.027f)
            curveTo(10.233f, 16.319f, 9.759f, 16.319f, 9.466f, 16.026f)
            lineTo(6.72f, 13.28f)
            curveTo(6.427f, 12.987f, 6.427f, 12.512f, 6.72f, 12.22f)
            curveTo(7.013f, 11.927f, 7.488f, 11.927f, 7.781f, 12.22f)
            lineTo(9.997f, 14.436f)
            lineTo(16.22f, 8.219f)
            curveTo(16.513f, 7.927f, 16.988f, 7.927f, 17.281f, 8.22f)
            curveTo(17.573f, 8.513f, 17.573f, 8.988f, 17.28f, 9.281f)
            close()
            moveTo(21f, 14.543f)
            curveTo(20.922f, 14.57f, 20.848f, 14.611f, 20.781f, 14.664f)
            lineTo(18.281f, 16.664f)
            curveTo(17.958f, 16.923f, 17.906f, 17.395f, 18.164f, 17.719f)
            curveTo(18.423f, 18.042f, 18.895f, 18.094f, 19.219f, 17.836f)
            lineTo(20.5f, 16.81f)
            verticalLineTo(21.25f)
            curveTo(20.5f, 21.664f, 20.836f, 22f, 21.25f, 22f)
            curveTo(21.664f, 22f, 22f, 21.664f, 22f, 21.25f)
            verticalLineTo(15.25f)
            curveTo(22f, 14.962f, 21.835f, 14.699f, 21.575f, 14.574f)
            curveTo(21.392f, 14.486f, 21.185f, 14.477f, 21f, 14.543f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun Checkbox1Preview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.Checkbox1, contentDescription = null)
    }
}
