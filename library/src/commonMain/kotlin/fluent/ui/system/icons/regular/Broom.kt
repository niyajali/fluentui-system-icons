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
import fluent.ui.system.icons.FluentUi
import org.jetbrains.compose.ui.tooling.preview.Preview

public val FluentUi.Regular.Broom: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.Broom",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(22.453f, 1.923f)
            curveTo(22.746f, 2.216f, 22.746f, 2.691f, 22.453f, 2.983f)
            lineTo(15.525f, 9.912f)
            curveTo(17.26f, 12.167f, 17.094f, 15.413f, 15.029f, 17.479f)
            lineTo(14.197f, 18.311f)
            lineTo(11.41f, 22.491f)
            curveTo(11.285f, 22.678f, 11.084f, 22.799f, 10.86f, 22.822f)
            curveTo(10.636f, 22.844f, 10.415f, 22.764f, 10.256f, 22.606f)
            lineTo(1.77f, 14.12f)
            curveTo(1.612f, 13.962f, 1.532f, 13.74f, 1.554f, 13.516f)
            curveTo(1.577f, 13.292f, 1.698f, 13.091f, 1.885f, 12.966f)
            lineTo(6.066f, 10.179f)
            lineTo(6.897f, 9.347f)
            curveTo(8.963f, 7.282f, 12.209f, 7.116f, 14.464f, 8.851f)
            lineTo(21.393f, 1.923f)
            curveTo(21.686f, 1.63f, 22.16f, 1.63f, 22.453f, 1.923f)
            close()
            moveTo(7.604f, 10.762f)
            lineTo(13.615f, 16.772f)
            lineTo(13.968f, 16.419f)
            curveTo(15.628f, 14.759f, 15.628f, 12.068f, 13.968f, 10.408f)
            curveTo(12.308f, 8.748f, 9.617f, 8.748f, 7.958f, 10.408f)
            lineTo(7.604f, 10.762f)
            close()
            moveTo(6.448f, 11.727f)
            lineTo(3.478f, 13.707f)
            lineTo(10.67f, 20.898f)
            lineTo(12.649f, 17.928f)
            lineTo(6.448f, 11.727f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun BroomPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Regular.Broom, contentDescription = null)
    }
}
