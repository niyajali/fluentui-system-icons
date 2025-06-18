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

public val FluentIcons.Filled.CubeMultiple: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.CubeMultiple",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(10.519f, 4.251f)
            curveTo(11.478f, 3.916f, 12.522f, 3.916f, 13.481f, 4.251f)
            curveTo(13.517f, 4.263f, 13.553f, 4.275f, 13.588f, 4.287f)
            lineTo(19.503f, 6.386f)
            curveTo(19.879f, 6.519f, 20.215f, 6.722f, 20.5f, 6.977f)
            verticalLineTo(6.562f)
            curveTo(20.5f, 5.715f, 19.967f, 4.96f, 19.169f, 4.677f)
            lineTo(14.007f, 2.845f)
            curveTo(12.708f, 2.385f, 11.292f, 2.385f, 9.994f, 2.845f)
            lineTo(4.831f, 4.677f)
            curveTo(4.033f, 4.96f, 3.5f, 5.715f, 3.5f, 6.562f)
            verticalLineTo(6.977f)
            curveTo(3.785f, 6.722f, 4.121f, 6.519f, 4.497f, 6.386f)
            lineTo(10.412f, 4.287f)
            curveTo(10.447f, 4.275f, 10.483f, 4.263f, 10.519f, 4.251f)
            close()
            moveTo(13.254f, 5.229f)
            curveTo(12.443f, 4.941f, 11.557f, 4.941f, 10.746f, 5.229f)
            lineTo(4.831f, 7.328f)
            curveTo(4.033f, 7.611f, 3.5f, 8.366f, 3.5f, 9.212f)
            verticalLineTo(17.447f)
            curveTo(3.5f, 18.294f, 4.033f, 19.048f, 4.831f, 19.332f)
            lineTo(10.746f, 21.43f)
            curveTo(11.557f, 21.718f, 12.443f, 21.718f, 13.254f, 21.43f)
            lineTo(19.169f, 19.332f)
            curveTo(19.967f, 19.048f, 20.5f, 18.294f, 20.5f, 17.447f)
            verticalLineTo(9.212f)
            curveTo(20.5f, 8.366f, 19.967f, 7.611f, 19.169f, 7.328f)
            lineTo(13.254f, 5.229f)
            close()
            moveTo(6.449f, 10.111f)
            curveTo(6.588f, 9.721f, 7.017f, 9.517f, 7.407f, 9.655f)
            lineTo(12f, 11.285f)
            lineTo(16.593f, 9.655f)
            curveTo(16.983f, 9.517f, 17.412f, 9.721f, 17.551f, 10.111f)
            curveTo(17.689f, 10.502f, 17.485f, 10.931f, 17.095f, 11.069f)
            lineTo(12.75f, 12.611f)
            verticalLineTo(17.331f)
            curveTo(12.75f, 17.745f, 12.414f, 18.081f, 12f, 18.081f)
            curveTo(11.586f, 18.081f, 11.25f, 17.745f, 11.25f, 17.331f)
            verticalLineTo(12.611f)
            lineTo(6.905f, 11.069f)
            curveTo(6.515f, 10.931f, 6.311f, 10.502f, 6.449f, 10.111f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun CubeMultiplePreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.CubeMultiple, contentDescription = null)
    }
}
