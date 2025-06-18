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
import fluent.ui.system.icons.FluentUi
import org.jetbrains.compose.ui.tooling.preview.Preview

public val FluentUi.Filled.CalendarShield: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.CalendarShield",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(21f, 8.5f)
            verticalLineTo(12.611f)
            curveTo(20.659f, 12.545f, 20.328f, 12.421f, 20.002f, 12.233f)
            curveTo(19.672f, 12.041f, 19.339f, 11.778f, 19.006f, 11.43f)
            curveTo(18.457f, 10.857f, 17.547f, 10.856f, 16.997f, 11.429f)
            curveTo(16.157f, 12.304f, 15.307f, 12.667f, 14.401f, 12.667f)
            curveTo(13.589f, 12.667f, 13.001f, 13.34f, 13.001f, 14.083f)
            verticalLineTo(16.593f)
            lineTo(13.005f, 16.875f)
            lineTo(13.005f, 16.883f)
            curveTo(13.044f, 18.029f, 13.305f, 19.075f, 13.816f, 19.988f)
            curveTo(14.02f, 20.353f, 14.26f, 20.69f, 14.535f, 21f)
            horizontalLineTo(6.25f)
            curveTo(4.455f, 21f, 3f, 19.545f, 3f, 17.75f)
            verticalLineTo(8.5f)
            horizontalLineTo(21f)
            close()
            moveTo(17.999f, 12f)
            curveTo(17.898f, 12f, 17.796f, 12.041f, 17.718f, 12.122f)
            curveTo(16.724f, 13.158f, 15.624f, 13.667f, 14.401f, 13.667f)
            curveTo(14.18f, 13.667f, 14.001f, 13.853f, 14.001f, 14.083f)
            verticalLineTo(16.584f)
            lineTo(14.005f, 16.85f)
            curveTo(14.039f, 17.863f, 14.268f, 18.748f, 14.689f, 19.5f)
            curveTo(15.013f, 20.079f, 15.45f, 20.58f, 16f, 21f)
            curveTo(16.524f, 21.4f, 17.149f, 21.727f, 17.875f, 21.979f)
            curveTo(17.957f, 22.007f, 18.045f, 22.007f, 18.128f, 21.979f)
            curveTo(20.688f, 21.09f, 22.001f, 19.266f, 22.001f, 16.584f)
            verticalLineTo(14.083f)
            lineTo(21.993f, 13.999f)
            curveTo(21.956f, 13.809f, 21.794f, 13.667f, 21.601f, 13.667f)
            curveTo(21.398f, 13.667f, 21.198f, 13.653f, 21.002f, 13.625f)
            curveTo(20.478f, 13.55f, 19.978f, 13.375f, 19.501f, 13.098f)
            curveTo(19.078f, 12.853f, 18.673f, 12.528f, 18.285f, 12.122f)
            curveTo(18.206f, 12.04f, 18.103f, 11.999f, 17.999f, 12f)
            close()
            moveTo(17.75f, 3f)
            curveTo(19.545f, 3f, 21f, 4.455f, 21f, 6.25f)
            verticalLineTo(7f)
            horizontalLineTo(3f)
            verticalLineTo(6.25f)
            curveTo(3f, 4.455f, 4.455f, 3f, 6.25f, 3f)
            horizontalLineTo(17.75f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun CalendarShieldPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Filled.CalendarShield, contentDescription = null)
    }
}
