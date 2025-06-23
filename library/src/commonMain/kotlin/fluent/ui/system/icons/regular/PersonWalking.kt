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
import org.jetbrains.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import fluent.ui.system.icons.FluentIcons

public val FluentIcons.Regular.PersonWalking: ImageVector
    get() {
        if (_PersonWalking != null) {
            return _PersonWalking!!
        }
        _PersonWalking = ImageVector.Builder(
            name = "Regular.PersonWalking",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(13f, 3.5f)
                curveTo(12.172f, 3.5f, 11.5f, 4.172f, 11.5f, 5f)
                curveTo(11.5f, 5.828f, 12.172f, 6.5f, 13f, 6.5f)
                curveTo(13.828f, 6.5f, 14.5f, 5.828f, 14.5f, 5f)
                curveTo(14.5f, 4.172f, 13.828f, 3.5f, 13f, 3.5f)
                close()
                moveTo(10f, 5f)
                curveTo(10f, 3.343f, 11.343f, 2f, 13f, 2f)
                curveTo(14.657f, 2f, 16f, 3.343f, 16f, 5f)
                curveTo(16f, 5.752f, 15.723f, 6.439f, 15.266f, 6.966f)
                lineTo(15.271f, 6.969f)
                curveTo(15.461f, 7.079f, 15.631f, 7.229f, 15.781f, 7.399f)
                curveTo(15.871f, 7.499f, 15.961f, 7.619f, 16.031f, 7.729f)
                lineTo(17f, 9.258f)
                curveTo(17.06f, 9.338f, 17.11f, 9.408f, 17.16f, 9.488f)
                lineTo(17.33f, 9.757f)
                lineTo(19.258f, 10.727f)
                curveTo(20.368f, 11.286f, 20.817f, 12.636f, 20.268f, 13.745f)
                curveTo(19.718f, 14.854f, 18.359f, 15.314f, 17.25f, 14.754f)
                lineTo(14.782f, 13.525f)
                curveTo(14.622f, 13.445f, 14.472f, 13.355f, 14.332f, 13.235f)
                curveTo(14.332f, 13.235f, 14.272f, 13.175f, 14.232f, 13.145f)
                curveTo(14.232f, 13.275f, 14.282f, 13.415f, 14.362f, 13.535f)
                lineTo(15.201f, 14.764f)
                curveTo(15.531f, 15.254f, 15.731f, 15.804f, 15.781f, 16.393f)
                lineTo(16.011f, 19.581f)
                curveTo(16.101f, 20.821f, 15.172f, 21.9f, 13.932f, 21.98f)
                curveTo(12.683f, 22.07f, 11.614f, 21.14f, 11.534f, 19.901f)
                lineTo(11.334f, 17.123f)
                lineTo(10.295f, 15.864f)
                lineTo(8.367f, 20.601f)
                curveTo(8.007f, 21.47f, 7.168f, 22f, 6.288f, 22f)
                lineTo(6.248f, 21.99f)
                curveTo(5.968f, 21.99f, 5.679f, 21.94f, 5.399f, 21.82f)
                curveTo(4.25f, 21.35f, 3.7f, 20.041f, 4.17f, 18.892f)
                lineTo(5.968f, 14.475f)
                curveTo(5.799f, 14.455f, 5.619f, 14.405f, 5.449f, 14.345f)
                curveTo(4.29f, 13.905f, 3.71f, 12.606f, 4.15f, 11.446f)
                lineTo(5.069f, 9.048f)
                curveTo(5.069f, 9.048f, 5.089f, 8.998f, 5.099f, 8.978f)
                lineTo(5.619f, 7.619f)
                curveTo(5.869f, 6.959f, 6.418f, 6.459f, 7.098f, 6.26f)
                lineTo(9.346f, 5.6f)
                curveTo(9.376f, 5.59f, 9.406f, 5.582f, 9.436f, 5.575f)
                curveTo(9.466f, 5.567f, 9.496f, 5.56f, 9.526f, 5.55f)
                curveTo(9.546f, 5.55f, 9.566f, 5.55f, 9.596f, 5.54f)
                curveTo(9.746f, 5.51f, 9.896f, 5.497f, 10.042f, 5.501f)
                curveTo(10.014f, 5.338f, 10f, 5.171f, 10f, 5f)
                close()
                moveTo(10.215f, 7.028f)
                curveTo(10.081f, 6.99f, 9.939f, 6.991f, 9.805f, 7.03f)
                lineTo(7.505f, 7.695f)
                curveTo(7.279f, 7.761f, 7.097f, 7.929f, 7.013f, 8.148f)
                lineTo(5.55f, 11.983f)
                curveTo(5.405f, 12.362f, 5.589f, 12.788f, 5.964f, 12.943f)
                curveTo(6.34f, 13.098f, 6.771f, 12.926f, 6.936f, 12.554f)
                lineTo(8.162f, 9.788f)
                curveTo(8.286f, 9.51f, 8.593f, 9.363f, 8.887f, 9.441f)
                curveTo(9.247f, 9.537f, 9.441f, 9.926f, 9.302f, 10.271f)
                lineTo(8.44f, 12.4f)
                lineTo(5.556f, 19.467f)
                curveTo(5.399f, 19.85f, 5.583f, 20.288f, 5.967f, 20.444f)
                curveTo(6.35f, 20.601f, 6.788f, 20.417f, 6.945f, 20.033f)
                lineTo(9.146f, 14.64f)
                curveTo(9.519f, 13.914f, 10.517f, 13.804f, 11.038f, 14.438f)
                lineTo(12.719f, 16.48f)
                curveTo(12.751f, 16.52f, 12.771f, 16.57f, 12.775f, 16.621f)
                lineTo(13.002f, 19.803f)
                curveTo(13.032f, 20.217f, 13.391f, 20.528f, 13.804f, 20.498f)
                curveTo(14.217f, 20.469f, 14.528f, 20.11f, 14.498f, 19.697f)
                lineTo(14.271f, 16.514f)
                curveTo(14.248f, 16.198f, 14.14f, 15.895f, 13.96f, 15.636f)
                curveTo(13.958f, 15.633f, 13.956f, 15.63f, 13.954f, 15.627f)
                curveTo(13.951f, 15.624f, 13.949f, 15.621f, 13.947f, 15.617f)
                lineTo(13.108f, 14.389f)
                curveTo(12.692f, 13.781f, 12.601f, 13.008f, 12.862f, 12.32f)
                lineTo(13.107f, 11.677f)
                lineTo(13.372f, 11.142f)
                curveTo(13.406f, 11.075f, 13.449f, 11.013f, 13.502f, 10.96f)
                curveTo(13.796f, 10.661f, 14.274f, 10.686f, 14.539f, 10.99f)
                lineTo(15.117f, 11.902f)
                curveTo(15.19f, 12.017f, 15.293f, 12.11f, 15.415f, 12.171f)
                lineTo(17.915f, 13.421f)
                curveTo(18.285f, 13.606f, 18.736f, 13.456f, 18.921f, 13.085f)
                curveTo(19.106f, 12.715f, 18.956f, 12.264f, 18.586f, 12.079f)
                lineTo(16.275f, 10.924f)
                lineTo(15.88f, 10.29f)
                curveTo(15.843f, 10.229f, 15.803f, 10.172f, 15.761f, 10.116f)
                lineTo(14.728f, 8.488f)
                curveTo(14.629f, 8.331f, 14.475f, 8.217f, 14.297f, 8.167f)
                lineTo(10.215f, 7.028f)
                close()
            }
        }.build()

        return _PersonWalking!!
    }

@Suppress("ObjectPropertyName")
private var _PersonWalking: ImageVector? = null

@Preview
@Composable
private fun PersonWalkingPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.PersonWalking, contentDescription = null)
    }
}
