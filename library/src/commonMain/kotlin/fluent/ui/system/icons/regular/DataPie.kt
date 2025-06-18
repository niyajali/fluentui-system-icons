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
import fluent.ui.system.icons.FluentIcons
import org.jetbrains.compose.ui.tooling.preview.Preview

public val FluentIcons.Regular.DataPie: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.DataPie",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(12.728f, 2.216f)
            curveTo(12.873f, 2.074f, 13.07f, 1.998f, 13.272f, 2.004f)
            curveTo(18.027f, 2.145f, 21.854f, 5.973f, 21.996f, 10.728f)
            curveTo(22.002f, 10.93f, 21.926f, 11.127f, 21.784f, 11.272f)
            curveTo(21.643f, 11.418f, 21.449f, 11.5f, 21.246f, 11.5f)
            horizontalLineTo(13.25f)
            curveTo(12.836f, 11.5f, 12.5f, 11.164f, 12.5f, 10.75f)
            verticalLineTo(2.754f)
            curveTo(12.5f, 2.551f, 12.582f, 2.357f, 12.728f, 2.216f)
            close()
            moveTo(14f, 3.566f)
            verticalLineTo(10f)
            horizontalLineTo(20.434f)
            curveTo(19.989f, 6.658f, 17.342f, 4.011f, 14f, 3.566f)
            close()
            moveTo(11f, 4.765f)
            curveTo(11f, 4.554f, 10.911f, 4.353f, 10.756f, 4.211f)
            curveTo(10.601f, 4.069f, 10.392f, 3.999f, 10.183f, 4.018f)
            curveTo(5.595f, 4.431f, 2f, 8.286f, 2f, 12.981f)
            curveTo(2f, 17.952f, 6.029f, 21.981f, 11f, 21.981f)
            curveTo(15.688f, 21.981f, 19.538f, 18.397f, 19.962f, 13.819f)
            curveTo(19.981f, 13.609f, 19.911f, 13.401f, 19.769f, 13.245f)
            curveTo(19.627f, 13.089f, 19.426f, 13f, 19.215f, 13f)
            horizontalLineTo(13.25f)
            curveTo(12.007f, 13f, 11f, 11.993f, 11f, 10.75f)
            verticalLineTo(4.765f)
            close()
            moveTo(3.5f, 12.981f)
            curveTo(3.5f, 9.353f, 6.077f, 6.326f, 9.5f, 5.631f)
            verticalLineTo(10.75f)
            curveTo(9.5f, 12.821f, 11.179f, 14.5f, 13.25f, 14.5f)
            horizontalLineTo(18.346f)
            curveTo(17.644f, 17.914f, 14.622f, 20.481f, 11f, 20.481f)
            curveTo(6.858f, 20.481f, 3.5f, 17.123f, 3.5f, 12.981f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun DataPiePreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.DataPie, contentDescription = null)
    }
}
