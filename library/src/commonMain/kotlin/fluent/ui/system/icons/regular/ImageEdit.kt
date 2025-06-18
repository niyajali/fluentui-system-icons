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

public val FluentIcons.Regular.ImageEdit: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.ImageEdit",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(20.998f, 6.25f)
            curveTo(20.998f, 4.455f, 19.544f, 3f, 17.749f, 3f)
            horizontalLineTo(6.25f)
            curveTo(4.455f, 3f, 3f, 4.455f, 3f, 6.25f)
            verticalLineTo(17.749f)
            curveTo(3f, 19.544f, 4.455f, 20.998f, 6.25f, 20.998f)
            horizontalLineTo(11.164f)
            lineTo(11.52f, 19.575f)
            curveTo(11.527f, 19.55f, 11.533f, 19.524f, 11.54f, 19.499f)
            horizontalLineTo(6.25f)
            curveTo(6.046f, 19.499f, 5.85f, 19.464f, 5.668f, 19.4f)
            lineTo(11.474f, 13.714f)
            lineTo(11.558f, 13.643f)
            curveTo(11.849f, 13.431f, 12.259f, 13.454f, 12.524f, 13.714f)
            lineTo(14.603f, 15.75f)
            lineTo(15.664f, 14.689f)
            lineTo(13.573f, 12.642f)
            lineTo(13.445f, 12.526f)
            curveTo(12.567f, 11.788f, 11.258f, 11.826f, 10.425f, 12.642f)
            lineTo(4.603f, 18.342f)
            curveTo(4.536f, 18.157f, 4.5f, 17.957f, 4.5f, 17.749f)
            verticalLineTo(6.25f)
            curveTo(4.5f, 5.283f, 5.283f, 4.5f, 6.25f, 4.5f)
            horizontalLineTo(17.749f)
            curveTo(18.715f, 4.5f, 19.499f, 5.283f, 19.499f, 6.25f)
            verticalLineTo(11.232f)
            curveTo(19.977f, 11.041f, 20.492f, 10.968f, 20.998f, 11.012f)
            verticalLineTo(6.25f)
            close()
            moveTo(17.503f, 8.752f)
            curveTo(17.503f, 7.508f, 16.495f, 6.5f, 15.251f, 6.5f)
            curveTo(14.007f, 6.5f, 12.999f, 7.508f, 12.999f, 8.752f)
            curveTo(12.999f, 9.995f, 14.007f, 11.003f, 15.251f, 11.003f)
            curveTo(16.495f, 11.003f, 17.503f, 9.995f, 17.503f, 8.752f)
            close()
            moveTo(14.499f, 8.752f)
            curveTo(14.499f, 8.336f, 14.836f, 8f, 15.251f, 8f)
            curveTo(15.666f, 8f, 16.003f, 8.336f, 16.003f, 8.752f)
            curveTo(16.003f, 9.167f, 15.666f, 9.504f, 15.251f, 9.504f)
            curveTo(14.836f, 9.504f, 14.499f, 9.167f, 14.499f, 8.752f)
            close()
            moveTo(19.098f, 12.669f)
            lineTo(13.196f, 18.57f)
            curveTo(12.852f, 18.915f, 12.608f, 19.346f, 12.49f, 19.818f)
            lineTo(12.033f, 21.648f)
            curveTo(11.834f, 22.444f, 12.555f, 23.166f, 13.351f, 22.967f)
            lineTo(15.181f, 22.509f)
            curveTo(15.653f, 22.391f, 16.085f, 22.147f, 16.429f, 21.803f)
            lineTo(22.331f, 15.901f)
            curveTo(23.223f, 15.008f, 23.223f, 13.561f, 22.331f, 12.669f)
            curveTo(21.438f, 11.776f, 19.991f, 11.776f, 19.098f, 12.669f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun ImageEditPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.ImageEdit, contentDescription = null)
    }
}
